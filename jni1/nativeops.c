#include "NativeOps.h"

long factorial(int val);

JNIEXPORT jlong JNICALL Java_NativeOps_factorial(JNIEnv *env, jobject obj, jint val)
{
    int result = factorial(val);
    return result;
}

long factorial(int val)
{
	if(val == 0 )
	{
		return 1;
	}else if(val > 0)
	{
		return val * factorial(val-1);
	}else{
		return -1;
	}
}
