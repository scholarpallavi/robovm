#include <nullvm.h>

Object* Java_java_lang_reflect_Array_createObjectArray(Env* env, Class* cls, Class* componentType, jint length) {
    return (Object*) nvmNewObjectArray(env, length, componentType, NULL, NULL);
}

