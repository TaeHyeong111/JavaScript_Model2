function Common() {
	this.move = function(t, domain, action, page) {// 프로퍼티에 메소드면 객체가됨 this.move
		// 프로퍼티, function 메소드
		location.href = t + '/' + domain + '.do?action=' + action + '&page='
				+ page
	};

	function Member() {
		var userid, ssn, password;
		this.setUserid = function(x) {
			this.userid = x;
		}
		this.setSsn = function(x) {
			this.ssn = x;
		}
		this.setPassword = function(x) {
			this.password = x;
		}
		this.getUserid = function() {
			return this.userid;
		}
		this.getSsn = function() {
			return this.ssn;
		}
		this.getPassword = function() {
			return this.password;
		}
		this.loginValidation = function() {
			if (this.userid === '') {
				alert("ID 입력하세요");
				return false;
			} else if (this.password === '') {
				alert("PASS 입력하세요");
				return false;
			} else {
				return true;
			}
		}
	}
};