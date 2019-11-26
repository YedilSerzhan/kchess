(function(e){function t(t){for(var a,o,i=t[0],l=t[1],c=t[2],d=0,m=[];d<i.length;d++)o=i[d],s[o]&&m.push(s[o][0]),s[o]=0;for(a in l)Object.prototype.hasOwnProperty.call(l,a)&&(e[a]=l[a]);u&&u(t);while(m.length)m.shift()();return n.push.apply(n,c||[]),r()}function r(){for(var e,t=0;t<n.length;t++){for(var r=n[t],a=!0,i=1;i<r.length;i++){var l=r[i];0!==s[l]&&(a=!1)}a&&(n.splice(t--,1),e=o(o.s=r[0]))}return e}var a={},s={app:0},n=[];function o(t){if(a[t])return a[t].exports;var r=a[t]={i:t,l:!1,exports:{}};return e[t].call(r.exports,r,r.exports,o),r.l=!0,r.exports}o.m=e,o.c=a,o.d=function(e,t,r){o.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:r})},o.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},o.t=function(e,t){if(1&t&&(e=o(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var r=Object.create(null);if(o.r(r),Object.defineProperty(r,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var a in e)o.d(r,a,function(t){return e[t]}.bind(null,a));return r},o.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return o.d(t,"a",t),t},o.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},o.p="/";var i=window["webpackJsonp"]=window["webpackJsonp"]||[],l=i.push.bind(i);i.push=t,i=i.slice();for(var c=0;c<i.length;c++)t(i[c]);var u=l;n.push([0,"chunk-vendors"]),r()})({0:function(e,t,r){e.exports=r("56d7")},"3ac3":function(e,t,r){"use strict";var a=r("673c"),s=r.n(a);s.a},"506e":function(e,t,r){},"56d7":function(e,t,r){"use strict";r.r(t);r("cadf"),r("551c"),r("f751"),r("097d");var a=r("2b0e"),s=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",{attrs:{id:"app"}},[r("Header"),e.authenticated?r("Navigation"):e._e(),r("router-view",{key:e.$route.fullPath}),r("Footer")],1)},n=[],o=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("header",{staticClass:"navbar navbar-expand-lg navbar-light bg-light"},[a("div",{staticClass:"brand-centered"},[a("router-link",{staticClass:"navbar-brand",attrs:{to:"/"}},[a("img",{attrs:{src:r("cf05"),height:"25",width:"25"}}),e._v("DTinder")])],1),a("div",{staticClass:"navbar-collapse"},[a("ul",{staticClass:"navbar-nav mr-auto"}),a("form",{staticClass:"form-inline my-2 my-lg-0"},[e.authenticated?a("button",{staticClass:"btn btn-primary",attrs:{type:"button",id:"logOutButton"},on:{click:e.logOut}},[e._v("Log out")]):e._e()])])])},i=[],l={name:"Header",computed:{authenticated:function(){return this.$store.getters.token}},methods:{logOut:function(){var e=this;this.$store.dispatch("logOut",{}).then(function(){e.$router.push("/")}).catch(function(){})}}},c=l,u=(r("3ac3"),r("2877")),d=Object(u["a"])(c,o,i,!1,null,"29a5c3ce",null),m=d.exports,f=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("footer")},p=[],g={name:"Footer"},v=g,h=Object(u["a"])(v,f,p,!1,null,"2af8dc74",null),b=h.exports,_=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("nav",{staticClass:"navbar navbar-expand-sm navbar-light bg-light"},[r("span"),e._m(0),r("div",{staticClass:"collapse navbar-collapse nav-wrapper",attrs:{id:"navbarContent"}},[r("ul",{staticClass:"navbar-nav nav-pills nav-fill"},[r("router-link",{staticClass:"nav-item",attrs:{tag:"li",to:"/profile","active-class":"active"}},[r("a",{staticClass:"nav-link"},[e._v("Profile")])]),r("router-link",{staticClass:"nav-item",attrs:{tag:"li",to:"/matchmaking","active-class":"active"}},[r("a",{staticClass:"nav-link"},[e._v("Matchmaking")])]),r("router-link",{staticClass:"nav-item",attrs:{tag:"li",to:"/chat","active-class":"active"}},[r("a",{staticClass:"nav-link"},[e._v("Chat")])])],1)])])},P=[function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("button",{staticClass:"navbar-toggler",attrs:{type:"button","data-toggle":"collapse","data-target":"#navbarContent","aria-controls":"navbarContent","aria-expanded":"false","aria-label":"Toggle navigation"}},[r("span",{staticClass:"navbar-toggler-icon"})])}],C={name:"Navigation",props:[]},k=C,w=(r("dd49"),Object(u["a"])(k,_,P,!1,null,"1f79604b",null)),y=w.exports,I={components:{Navigation:y,Footer:b,Header:m},computed:{authenticated:function(){return this.$store.getters.token}}},x=I,E=Object(u["a"])(x,s,n,!1,null,null,null),M=E.exports,S=r("8c4f"),L=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",{staticClass:"container-fluid"},[r("div",{staticClass:"row"},[r("div",{staticClass:"col-md-4"}),"login"===e.currentTab?r("div",{staticClass:"col-md-4 text-center"},[r("h2",[e._v("Sign in")]),e.loginErrors.some(function(e){return"bad.credentials"===e})?r("div",{staticClass:"alert alert-danger",attrs:{role:"alert"}},[e._v("\n                Wrong username and/or password.\n            ")]):e._e(),r("form",[r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"logInUsernameInput"}},[e._v("Username")]),r("input",{directives:[{name:"model",rawName:"v-model",value:e.logInUsername,expression:"logInUsername"}],staticClass:"form-control",attrs:{type:"text",id:"logInUsernameInput",placeholder:"Enter username"},domProps:{value:e.logInUsername},on:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.submitLogIn(t)},input:function(t){t.target.composing||(e.logInUsername=t.target.value)}}})]),r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"logInPasswordInput"}},[e._v("Password")]),r("input",{directives:[{name:"model",rawName:"v-model",value:e.logInPassword,expression:"logInPassword"}],staticClass:"form-control",attrs:{type:"password",id:"logInPasswordInput",placeholder:"Enter password"},domProps:{value:e.logInPassword},on:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.submitLogIn(t)},input:function(t){t.target.composing||(e.logInPassword=t.target.value)}}})]),e.loginInProgress?e._e():r("button",{staticClass:"btn btn-primary",attrs:{type:"button"},on:{click:e.submitLogIn}},[e._v("Sign in")]),e.loginInProgress?r("button",{staticClass:"btn btn-primary",attrs:{type:"button",disabled:""}},[r("span",{staticClass:"spinner-border spinner-border-sm",attrs:{role:"status","aria-hidden":"true"}}),e._v("\n                    Loading...\n                ")]):e._e(),r("hr"),r("a",{attrs:{href:"#"},on:{click:function(t){e.currentTab="register"}}},[e._v("I don't have an account")])])]):e._e(),"register"===e.currentTab?r("div",{staticClass:"col-md-4 text-center"},[r("h2",[e._v("Sign up")]),e.registerSuccess?r("div",{staticClass:"alert alert-success",attrs:{role:"alert"}},[e._v("\n                Successfully registered. You can "),r("a",{attrs:{href:"#"},on:{click:function(t){e.currentTab="login",e.registerSuccess=!1}}},[e._v("sign\n                in")]),e._v(" now.\n            ")]):e._e(),e.registerFailed?r("div",{staticClass:"alert alert-danger",attrs:{role:"alert"}},[e._v("\n                Something went wrong, please try again.\n            ")]):e._e(),r("form",{attrs:{id:"registerForm"}},[r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"registerUsernameInput"}},[e._v("Username")]),r("input",{directives:[{name:"model",rawName:"v-model",value:e.registerUsername,expression:"registerUsername"}],staticClass:"form-control no-autocomplete",class:{"is-invalid":e.registrationUsernameError},attrs:{type:"text",id:"registerUsernameInput",placeholder:"Enter username",readonly:""},domProps:{value:e.registerUsername},on:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.submitRegistration(t)},input:function(t){t.target.composing||(e.registerUsername=t.target.value)}}}),e.registerErrors.some(function(e){return"username.length.error"===e})?r("div",{staticClass:"invalid-feedback"},[e._v("The\n                        username should be at least 1 symbol long\n                    ")]):e._e(),e.registerErrors.some(function(e){return"username.is.taken"===e})?r("div",{staticClass:"invalid-feedback"},[e._v("The\n                        username is already taken, try another one\n                    ")]):e._e()]),r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"registerPasswordInput1"}},[e._v("Password")]),r("input",{directives:[{name:"model",rawName:"v-model",value:e.registerPassword1,expression:"registerPassword1"}],staticClass:"form-control no-autocomplete",class:{"is-invalid":e.registrationPassword1Error},attrs:{type:"password",id:"registerPasswordInput1",placeholder:"Enter password",readonly:""},domProps:{value:e.registerPassword1},on:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.submitRegistration(t)},input:function(t){t.target.composing||(e.registerPassword1=t.target.value)}}}),e.registerErrors.some(function(e){return"password.too.weak"===e})?r("div",{staticClass:"invalid-feedback"},[e._v("The\n                        password should be at least 6 symbols long\n                    ")]):e._e()]),r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"registerPasswordInput2"}},[e._v("Confirm password")]),r("input",{directives:[{name:"model",rawName:"v-model",value:e.registerPassword2,expression:"registerPassword2"}],staticClass:"form-control no-autocomplete",class:{"is-invalid":e.registrationPassword2Error},attrs:{type:"password",id:"registerPasswordInput2",placeholder:"Enter password again",readonly:""},domProps:{value:e.registerPassword2},on:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.submitRegistration(t)},input:function(t){t.target.composing||(e.registerPassword2=t.target.value)}}}),e.registerErrors.some(function(e){return"passwords.not.match"===e})?r("div",{staticClass:"invalid-feedback"},[e._v("\n                        Passwords are not same\n                    ")]):e._e()]),e.registerInProgress?e._e():r("button",{staticClass:"btn btn-primary",attrs:{type:"button"},on:{click:e.submitRegistration}},[e._v("Sign up")]),e.registerInProgress?r("button",{staticClass:"btn btn-primary",attrs:{type:"button",disabled:""}},[r("span",{staticClass:"spinner-border spinner-border-sm",attrs:{role:"status","aria-hidden":"true"}}),e._v("\n                    Loading...\n                ")]):e._e(),r("hr"),r("a",{attrs:{href:"#"},on:{click:function(t){e.currentTab="login"}}},[e._v("I already have an account")])])]):e._e(),r("div",{staticClass:"col-md-4"})])])},A=[],U=(r("a481"),r("6762"),{name:"Anonymous",props:[],data:function(){return{currentTab:"login",logInUsername:"",logInPassword:"",loginInProgress:!1,loginErrors:[],registerUsername:"",registerPassword1:"",registerPassword2:"",registerSuccess:!1,registerInProgress:!1,registerFailed:!1,registerErrors:[]}},computed:{registrationUsernameError:function(){var e=["username.length.error","username.is.taken"];return this.registerErrors.some(function(t){return e.includes(t)})},registrationPassword1Error:function(){var e=["password.too.weak"];return this.registerErrors.some(function(t){return e.includes(t)})},registrationPassword2Error:function(){var e=["passwords.not.match"];return this.registerErrors.some(function(t){return e.includes(t)})}},methods:{submitLogIn:function(){var e=this;this.loginInProgress=!0,this.$store.dispatch("checkCredentials",{username:this.logInUsername,password:this.logInPassword}).then(function(){e.loginInProgress=!1,e.$router.push("profile")}).catch(function(t){e.loginInProgress=!1,"bad.credentials"===t&&(e.loginErrors=[t])})},submitRegistration:function(){var e=this;this.registerInProgress=!0,this.registerSuccess=!1;var t=new FormData;t.append("username",this.registerUsername),t.append("password",this.registerPassword1),t.append("passwordVerification",this.registerPassword2),this.axios.post("/registration/submit",t).then(function(t){e.registerInProgress=!1,"ok"===t.data.status?(e.registerSuccess=!0,e.registerErrors=[],$("#registerForm")[0].reset(),e.registerFailed=!1):"error"===t.data.status&&(e.registerErrors=t.data.content[0],e.registerFailed=!1)}).catch(function(t){e.registerInProgress=!1,t&&(e.registerFailed=!0)})}},created:function(){this.$store.getters.token&&this.$router.replace("/profile")},updated:function(){this.$nextTick(function(){$("input.no-autocomplete").removeAttr("readonly")})}}),O=U,N=Object(u["a"])(O,L,A,!1,null,"48d467bc",null),T=N.exports,F=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",[r("div",{staticClass:"userProfile"},[r("h1",[e._v("My user profile")]),r("form",[r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"profileNameInput"}},[e._v("My name")]),r("input",{directives:[{name:"model",rawName:"v-model",value:e.userProfileName,expression:"userProfileName"}],staticClass:"form-control",attrs:{type:"text",id:"profileNameInput",placeholder:"My name"},domProps:{value:e.userProfileName},on:{input:function(t){t.target.composing||(e.userProfileName=t.target.value)}}})]),r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"profileGenderInput"}},[e._v("My gender")]),r("select",{directives:[{name:"model",rawName:"v-model",value:e.userProfileGender,expression:"userProfileGender"}],staticClass:"form-control",attrs:{id:"profileGenderInput"},on:{change:function(t){var r=Array.prototype.filter.call(t.target.options,function(e){return e.selected}).map(function(e){var t="_value"in e?e._value:e.value;return t});e.userProfileGender=t.target.multiple?r:r[0]}}},[r("option",{attrs:{value:"MALE"}},[e._v("Male")]),r("option",{attrs:{value:"FEMALE"}},[e._v("Female")]),r("option",{attrs:{value:"OTHER"}},[e._v("Other")]),r("option",{attrs:{value:"NOT_SPECIFIED"}},[e._v("I'd rather not tell")])])]),r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"profileAgeInput"}},[e._v("My age")]),r("input",{directives:[{name:"model",rawName:"v-model.number",value:e.userProfileAge,expression:"userProfileAge",modifiers:{number:!0}}],staticClass:"form-control",attrs:{type:"number",id:"profileAgeInput",placeholder:"My age"},domProps:{value:e.userProfileAge},on:{input:function(t){t.target.composing||(e.userProfileAge=e._n(t.target.value))},blur:function(t){return e.$forceUpdate()}}})]),r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"profileLocationInput"}},[e._v("Where am I")]),r("input",{directives:[{name:"model",rawName:"v-model",value:e.userProfileLocation,expression:"userProfileLocation"}],staticClass:"form-control",attrs:{type:"text",id:"profileLocationInput",placeholder:"My city"},domProps:{value:e.userProfileLocation},on:{input:function(t){t.target.composing||(e.userProfileLocation=t.target.value)}}})]),r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"profileDescriptionInput"}},[e._v("About me")]),r("textarea",{directives:[{name:"model",rawName:"v-model.trim",value:e.userProfileDescription,expression:"userProfileDescription",modifiers:{trim:!0}}],staticClass:"form-control",attrs:{id:"profileDescriptionInput",rows:"3"},domProps:{value:e.userProfileDescription},on:{input:function(t){t.target.composing||(e.userProfileDescription=t.target.value.trim())},blur:function(t){return e.$forceUpdate()}}})]),r("button",{staticClass:"btn btn-primary",attrs:{type:"button"},on:{click:e.saveUserProfile}},[e._v("Save my profile")])])]),r("div",{staticClass:"mmPreferences"},[r("h1",[e._v("My matchmaking preferences")]),r("form",[r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"mmPrefGenderInput"}},[e._v("I want to find")]),r("select",{directives:[{name:"model",rawName:"v-model",value:e.mmPrefGender,expression:"mmPrefGender"}],staticClass:"form-control",attrs:{id:"mmPrefGenderInput"},on:{change:function(t){var r=Array.prototype.filter.call(t.target.options,function(e){return e.selected}).map(function(e){var t="_value"in e?e._value:e.value;return t});e.mmPrefGender=t.target.multiple?r:r[0]}}},[r("option",{attrs:{value:"MALE"}},[e._v("Male")]),r("option",{attrs:{value:"FEMALE"}},[e._v("Female")]),r("option",{attrs:{value:"ANY"}},[e._v("Any")])])]),r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"mmPrefAgeMinInput"}},[e._v("Min age")]),r("input",{directives:[{name:"model",rawName:"v-model.number",value:e.mmPrefAgeMin,expression:"mmPrefAgeMin",modifiers:{number:!0}}],staticClass:"form-control",attrs:{type:"number",id:"mmPrefAgeMinInput",placeholder:"Not younger than"},domProps:{value:e.mmPrefAgeMin},on:{input:function(t){t.target.composing||(e.mmPrefAgeMin=e._n(t.target.value))},blur:function(t){return e.$forceUpdate()}}})]),r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"mmPrefAgeMaxInput"}},[e._v("Max age")]),r("input",{directives:[{name:"model",rawName:"v-model.number",value:e.mmPrefAgeMax,expression:"mmPrefAgeMax",modifiers:{number:!0}}],staticClass:"form-control",attrs:{type:"number",id:"mmPrefAgeMaxInput",placeholder:"Not older than"},domProps:{value:e.mmPrefAgeMax},on:{input:function(t){t.target.composing||(e.mmPrefAgeMax=e._n(t.target.value))},blur:function(t){return e.$forceUpdate()}}})]),r("button",{staticClass:"btn btn-primary",attrs:{type:"button"},on:{click:e.saveMmPreferences}},[e._v("Save my preferences")])])])])},G=[],D=(r("7f7f"),{name:"Profile",data:function(){return{userProfileName:"",userProfileGender:"",userProfileAge:"",userProfileLocation:"",userProfileDescription:"",userProfileSaveSuccess:!1,userProfileSaveError:!1,userProfileLoadError:!1,mmPrefGender:"",mmPrefAgeMin:"",mmPrefAgeMax:"",mmPrefSaveSuccess:!1,mmPrefSaveError:!1,mmPrefLoadError:!1}},methods:{saveUserProfile:function(){var e=this;this.userProfileSaveSuccess=!1,this.userProfileSaveError=!1;var t=new FormData;t.append("name",this.userProfileName),t.append("gender",this.userProfileGender),t.append("age",this.userProfileAge),t.append("location",this.userProfileLocation),t.append("description",this.userProfileDescription),this.axios.post("/profile/info",t).then(function(t){"ok"===t.data.status?e.userProfileSaveSuccess=!0:"error"===t.data.status&&(e.userProfileSaveError=!0)}).catch(function(t){t&&(e.userProfileSaveError=!0)})},saveMmPreferences:function(){var e=this;this.mmPrefSaveSuccess=!1,this.mmPrefSaveError=!1;var t=new FormData;t.append("genderPreference",this.mmPrefGender),t.append("agePreferenceMin",this.mmPrefAgeMin),t.append("agePreferenceMax",this.mmPrefAgeMax),this.axios.post("/profile/pref",t).then(function(t){"ok"===t.data.status?e.mmPrefSaveSuccess=!0:"error"===t.data.status&&(e.mmPrefSaveError=!0)}).catch(function(t){t&&(e.mmPrefSaveError=!0)})}},created:function(){var e=this;this.$store.getters.token?(this.userProfileLoadError=!1,this.axios.get("/profile/info").then(function(t){if("ok"===t.data.status){e.userProfileLoadError=!1;var r=t.data.content[0];e.userProfileName=r.name,e.userProfileGender=r.gender,e.userProfileAge=r.age,e.userProfileLocation=r.location,e.userProfileDescription=r.description}else"error"===t.data.status&&(e.userProfileLoadError=!0)}).catch(function(t){t&&(e.userProfileLoadError=!0)}),this.mmPrefLoadError=!1,this.axios.get("/profile/pref").then(function(t){if("ok"===t.data.status){e.mmPrefLoadError=!1;var r=t.data.content[0];e.mmPrefGender=r.genderPreference,e.mmPrefAgeMin=r.agePreferenceMin,e.mmPrefAgeMax=r.agePreferenceMax}else"error"===t.data.status&&(e.mmPrefLoadError=!0)}).catch(function(t){t&&(e.mmPrefLoadError=!0)})):this.$router.replace("/")}}),j=D,R=Object(u["a"])(j,F,G,!1,null,"266d0147",null),H=R.exports,B=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",{staticClass:"container-fluid"},[r("div",{staticClass:"col-3"}),r("div",{staticClass:"col-6"},[r("div",{staticClass:"card"},[r("div",{staticClass:"card-header"},[e._v("What about this one?")]),r("div",{staticClass:"card-body"},[r("p",[e._v("Name: "+e._s(e.currentCandidate.name))]),r("p",[e._v("Age: "+e._s(e.currentCandidate.age))]),r("p",[e._v("Gender: "+e._s(e.currentCandidate.gender))]),r("p",[e._v("From: "+e._s(e.currentCandidate.location))]),r("p",[e._v("From: "+e._s(e.currentCandidate.description))])]),r("div",{staticClass:"card-footer"},[r("div",{staticClass:"container-fluid"},[r("div",{staticClass:"row"},[r("div",{staticClass:"col"},[r("button",{staticClass:"btn btn-success",attrs:{type:"button"},on:{click:e.like}},[e._v("Like")])]),r("div",{staticClass:"col"},[r("button",{staticClass:"btn btn-danger",attrs:{type:"button"},on:{click:e.dislike}},[e._v("Dislike")])])])])])])]),r("div",{staticClass:"col-3"})])},J=[],W={name:"Swiper",data:function(){return{id:"",currentCandidate:{name:"name",gender:"gender",age:"age",location:"location",description:"Some quick example text to build on the card title and make up the bulk of the card's content."},loading:!0,loadingError:!1,voteError:!1}},methods:{like:function(){var e=this,t=new FormData;t.append("id",this.id),this.axios.post("/mm/like",t).then(function(t){"ok"===t.data.status?e.next():"error"===t.data.status&&(e.voteError=!0)}).catch(function(t){t&&(e.voteError=!0)})},dislike:function(){var e=this,t=new FormData;t.append("id",this.id),this.axios.post("/mm/dislike",t).then(function(t){"ok"===t.data.status?e.next():"error"===t.data.status&&(e.voteError=!0)}).catch(function(t){t&&(e.voteError=!0)})},next:function(){var e=this;this.loadingError=!1,this.loading=!0,this.axios.get("/mm/next").then(function(t){if("ok"===t.data.status){var r=t.data.content[0];e.currentCandidate.id=r.id,e.currentCandidate.name=r.name,e.currentCandidate.gender=r.gender,e.currentCandidate.age=r.age,e.currentCandidate.location=r.location,e.currentCandidate.description=r.description}else"error"===t.data.status&&(e.loadingError=!0)}).catch(function(t){t&&(e.loadingError=!0)}),this.loading=!1}},created:function(){this.$store.getters.token?this.next():this.$router.replace("/")}},q=W,Y=Object(u["a"])(q,B,J,!1,null,"dacdfdd8",null),z=Y.exports,Q=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div")},V=[],K={name:"Chat",data:function(){return{matchID:null}},created:function(){this.$store.getters.token?this.matchID=this.$route.params.matchId:this.$router.replace("/")}},X=K,Z=Object(u["a"])(X,Q,V,!1,null,"79967fab",null),ee=Z.exports,te=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",{staticClass:"messaging"},[r("div",{staticClass:"inbox_msg"},[r("div",{staticClass:"inbox_people"},[e._m(0),r("div",{staticClass:"inbox_chat"},e._l(e.chatList,function(t){return r("div",{key:t.id,staticClass:"chat_list",on:{click:function(r){return e.loadChat(t)}}},[r("div",{staticClass:"chat_people"},[r("div",{staticClass:"chat_ib"},[r("h5",[e._v(e._s(t.matchedUser.name)+" "),r("span",{staticClass:"chat_date"},[e._v(e._s(t.matchedAt))])]),r("p",[null!=t.lastMessage?r("span",[e._v(e._s(t.lastMessage.text))]):e._e()])])])])}),0)]),r("div",{staticClass:"mesgs"},[r("div",{staticClass:"msg_history"},e._l(e.activeChatMessages,function(t){return r("div",{key:t.id,class:{outgoing_msg:e.isMsgSent(t),incoming_msg:!e.isMsgSent(t)}},[r("div",{class:{sent_msg:e.isMsgSent(t),received_msg:!e.isMsgSent(t)}},[r("div",{class:{received_withd_msg:!e.isMsgSent(t)}},[r("p",[e._v(e._s(t.text))]),r("span",{staticClass:"time_date"},[e._v(e._s(t.sentAt))])])])])}),0),null!=e.activeChat?r("div",{staticClass:"type_msg"},[r("div",{staticClass:"input_msg_write"},[r("input",{directives:[{name:"model",rawName:"v-model.trim",value:e.newChatMsgText,expression:"newChatMsgText",modifiers:{trim:!0}}],staticClass:"write_msg",attrs:{type:"text",placeholder:"Type a message"},domProps:{value:e.newChatMsgText},on:{input:function(t){t.target.composing||(e.newChatMsgText=t.target.value.trim())},blur:function(t){return e.$forceUpdate()}}}),r("button",{staticClass:"msg_send_btn",attrs:{type:"button"},on:{click:e.sendMsg}},[r("i",{staticClass:"fa fa-paper-plane-o",attrs:{"aria-hidden":"true"}})])])]):e._e()])])])},re=[function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",{staticClass:"headind_srch"},[r("div",{staticClass:"recent_heading"},[r("h4",[e._v("Chats list")])])])}],ae={name:"ChatList",data:function(){return{currentUserId:null,chatList:[],activeChat:null,activeChatMessages:[],newChatMsgText:""}},methods:{loadChatsList:function(){var e=this;this.axios.get("/chat/list").then(function(t){"ok"===t.data.status?e.chatList=t.data.content[0]:t.data.status}).catch(function(e){})},loadChat:function(e){var t=this;this.activeChat=e,this.axios.get("/chat/get",{params:{matchId:e.id,from:0,to:10}}).then(function(e){"ok"===e.data.status?(console.log("/chat/get - success"),console.log(e.data),t.activeChatMessages=e.data.content[0]):"error"===e.data.status&&(console.log("/chat/get - error"),console.log(e.data))}).catch(function(e){console.log("/chat/get - fail"),console.log(e)})},sendMsg:function(){var e=this,t=this,r=new FormData;r.append("matchId",this.activeChat.id),r.append("text",this.newChatMsgText),this.axios.post("/chat/send",r).then(function(r){"ok"===r.data.status?(t.newChatMsgText="",t.loadChat(e.activeChat)):r.data.status}).catch(function(e){})},isMsgSent:function(e){return console.log(e),console.log(e.sender.id),console.log(this.currentUserId),e.sender.id==this.currentUserId}},created:function(){this.$store.getters.token?(this.currentUserId=this.$store.getters.userId,this.loadChatsList()):this.$router.replace("/")}},se=ae,ne=(r("59b5"),Object(u["a"])(se,te,re,!1,null,"78954342",null)),oe=ne.exports;a["a"].use(S["a"]);var ie=new S["a"]({routes:[{path:"/",name:"anonymous",component:T},{path:"/profile",name:"profile",component:H},{path:"/matchmaking",name:"matchmaking",component:z},{path:"/chat",name:"chatList",component:oe},{path:"/chat/:matchId",name:"chat",component:ee}],mode:"history",scrollBehavior:function(e,t,r){return r||{x:0,y:0}},linkActiveClass:"is-active"}),le=ie,ce=r("2f62");a["a"].use(ce["a"]);var ue={userId:null,token:localStorage.getItem("auth_token"),error:null},de={token:function(e){return e.token},error:function(e){return e.error},userId:function(e){return e.userId}},me={LOGIN_SUCCESS:function(e,t){e.token=t,e.error=null},SET_USER_ID:function(e,t){e.userId=t,e.error=null},LOGIN_FAILURE:function(e,t){e.token=null,e.userId=null,e.error=t},LOGOUT:function(e){e.token=null,e.userId=null,e.error=null}},fe={checkCredentials:function(e,t){var r=new FormData;return r.append("username",t.username),r.append("password",t.password),a["a"].axios.post("/auth/token",r).then(function(t){if(!t.data.validCredentials)throw e.commit("LOGIN_FAILURE","bad.credentials"),"bad.credentials";localStorage.setItem("auth_token",t.data.authToken),e.commit("LOGIN_SUCCESS",t.data.authToken,t.data.userId),e.commit("SET_USER_ID",t.data.userId)}).catch(function(t){throw e.commit("LOGIN_FAILURE",t),t})},logOut:function(e){localStorage.removeItem("auth_token"),e.commit("LOGOUT")}},pe=new ce["a"].Store({strict:!1,state:ue,getters:de,mutations:me,actions:fe}),ge=r("795b"),ve=r.n(ge),he=r("a7fe"),be=r.n(he),_e=r("bc3a"),Pe=r.n(_e);Pe.a.defaults.baseURL="http://localhost:5000/api",Pe.a.interceptors.request.use(function(e){return pe.getters.token&&(e.headers.common["Authorization"]="Basic "+pe.getters.token),e},function(e){return ve.a.reject(e)}),a["a"].use(be.a,Pe.a);var Ce=r("9f7b"),ke=r.n(Ce);r("4989"),r("ab8b"),r("177c");window.$=r("1157"),window.JQuery=r("1157"),a["a"].use(ke.a),a["a"].config.productionTip=!1,new a["a"]({router:le,store:pe,render:function(e){return e(M)}}).$mount("#app")},"59b5":function(e,t,r){"use strict";var a=r("506e"),s=r.n(a);s.a},"673c":function(e,t,r){},a6d0:function(e,t,r){},cf05:function(e,t,r){e.exports=r.p+"img/logo.82b9c7a5.png"},dd49:function(e,t,r){"use strict";var a=r("a6d0"),s=r.n(a);s.a}});
//# sourceMappingURL=app.a41e4b25.js.map