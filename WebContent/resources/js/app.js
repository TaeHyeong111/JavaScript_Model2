var mem = (function() {
}()); // function(){}();
(function() {
})();// Goofy
(function() {
}()) // grooby

var router = (()=> {
	return {
		'move' : x => { //키값(String), 객체
			location.href = x[0] + '/' + x[1] + '.do?action=' + x[2] + '&page='
			+ x[3]
}}; 
})();

var service = (()=>{
	return {
		nullChecker : x=>{
			var i = 0;
			var j = {
					checker : true,
					text : '필수입력값이 없습니다'
			};
			for(i in x){
				if(x[i] === ''){
					j.checker = false;
				}
				return j;
			}
		}
	};
})();
// ${ctx}','member','move','joinForm

var member = (()=> {
	   var _name, _userid, _ssn, _password,_gender,_age,_roll,_teamid;
	   var setName = (name)=> {this._name = name;}
	   var setUserid = (userid)=> {this._userid = userid;}
	   var setPassword = (password)=> {this._password = password;}
	   var setSsn = (ssn)=> {this._ssn = ssn;}
	   
	   
	   var setAge = x=>{
	    	var date = new Date().getFullYear();
	    	alert(x);
	    	alert(x.substring(0,2));
	    	this._age = date - 1900 + 1 - x.substring(0,2);
	    	alert(this._age);
	    	/*this._age = date - 1900 + 1 - x.getSsn.substring(0,3);*/
	    	}
	   var setGender = x => {
			   if(x.substring(7,8)==='1'){
				   this._gender = 'man';
				   alert(this._gender);
			   }else{
				   this._gender = 'woman';
				   alert(this._gender);
			   }
	   }

	   var getName = ()=> {return this._name;}
	   var getUserid = ()=> {return this._userid;}
	   var getSsn = ()=> {return this._ssn;}
	   var getPassword = ()=> {return this._password;}
	   var getGender = ()=> {return this._gender;}
	   var getAge = ()=> {return this._age;}
	   return{
	       setName : setName,
	       setUserid : setUserid,
	       setSsn : setSsn,
	       setPassword : setPassword,
	       setGender : setGender,
	       setAge : setAge,
	       getName : getName,
	       getUserid : getUserid,
	       getSsn: getSsn,
	       getPassword : getPassword,
	       getGender : getGender,
	       getAge : getAge,
	       join : x =>{
	           member.setAge(x);
	           member.setGender(x);
	       }
	   };
	})();

/* var service = (()=>{
		return { 
			loginValidation : x => { // x는 받아오는애
				var ok = false;
				if (x.getUserid === '') {
					alert("ID 입력하세요");
					return false;
				} else if (x.getPassword === '') {
					alert("PASS 입력하세요");
					return false;
				} else {
					return true;
				}
			}
		};
	})();*/