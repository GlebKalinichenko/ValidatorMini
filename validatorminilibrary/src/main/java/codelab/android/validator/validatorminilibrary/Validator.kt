package codelab.android.validator.validatorminilibrary

class Validator(var emailValidation: Boolean = false, var phoneValidation: Boolean = false) {

    private constructor(builder: Builder): this(builder.emailValidation, builder.phoneValidation)

    /**
     * Builder for create scopes of validation rules
     * */
    class Builder {
        var emailValidation: Boolean = false
            private set
        var phoneValidation: Boolean = false
            private set

        fun build() = Validator(this)
    }

    /**
     * Call validation all rules
     * */
    fun validate() {}
}