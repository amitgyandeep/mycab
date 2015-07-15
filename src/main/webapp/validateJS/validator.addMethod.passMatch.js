jQuery.validator.addMethod( 'passwordMatch', function(value, element) {
    
    // The two password inputs
    var password = $("#inputPassword2").val();
    var confirmPassword = $("#pass-confirm").val();

    // Check for equality with the password inputs
    if (password != confirmPassword ) {
        return false;
    } else {
        return true;
    }

}, "Your Passwords Must Match");



// ==========================================================================
// Registration Form : jquery validation
// http://jqueryvalidation.org/validate

$('#form-change-pass').validate({
    // rules
    rules: {
    	password1: {
            required: true,
            minlength: 5
        },
        newPassword: {
            required: true,
            minlength: 5,
            passwordMatch: true // set this on the field you're trying to match
        }
    },

    // messages
    messages: {
    	password1: {
            required: "What is your password?",
            minlength: "Your password must contain more than 5 characters"
        },
        newPassword: {
            required: "You must confirm your password",
            minlength: "Your password must contain more than 5 characters",
            passwordMatch: "Your Passwords Must Match" // custom message for mismatched passwords
        }
    }
});//end validate