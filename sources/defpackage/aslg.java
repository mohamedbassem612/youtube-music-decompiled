package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aslg implements aihr {
    DEBUG_COUNTER_TYPE_UNKNOWN(0),
    DEBUG_COUNTER_TYPE_JS_CONTROLLER_CREATE_DISPOSE_COUNT(1),
    DEBUG_COUNTER_TYPE_DJINNI_JNI_GLOBAL_REF_COUNT(2),
    DEBUG_COUNTER_TYPE_JS_CONTROLLER_CREATE_COUNT(3),
    DEBUG_COUNTER_TYPE_JS_CONTROLLER_DISPOSE_COUNT(4);

    public final int f;

    aslg(int i) {
        this.f = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
