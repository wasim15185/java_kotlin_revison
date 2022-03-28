/**
 * out : using this key word we limit Generic type of Means if I write "IamOutGenericExample< out T>" in class then
 * inside this class only we can this "Generic Type as a return type " But we cannot use "Generic Type as a parameter type of function"
 *
 * in : using this key word we limit Generic type of Means if I write "IamOutGenericExample< out T>" in class then
 * inside this class only we can use "Generic Type as a parameter type of function" . But we cannot use "Generic Type as a return type "
 *
 */

abstract class IamOutGenericExample<out T> {

   // abstract fun getValue(parameter: T) // this throw error As we write '<out T>' so we can't use 'T' as parameter

    abstract fun passValue(): T // As we write '<out T>' so we  only we can 'T' as return Type

}


abstract class IamInGenericExample<in T>{
    abstract fun getValue(parameter: T)  // As we write '<in T>' so we can 'T' as parameter

   // abstract fun passValue(): T // this throw error As we write '<in T>' so we can't use 'T' as return Type
}


fun main() {

}