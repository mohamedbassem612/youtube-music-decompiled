package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jni {
    public final /* synthetic */ Object a;

    public jni(Object obj) {
        this.a = obj;
    }

    public final void a(heg hegVar) {
        Optional optionalOfNullable = Optional.ofNullable(hegVar.a);
        boolean zIsPresent = optionalOfNullable.isPresent();
        Object obj = this.a;
        if (!zIsPresent) {
            ((jnj) obj).a();
        } else {
            ((jnj) obj).d((amzh) optionalOfNullable.get());
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    @tcc
    public void handleAdCompleteEvent(sen senVar) {
        Optional optionalEmpty;
        jnj jnjVar = (jnj) this.a;
        heg hegVar = (heg) jnjVar.b;
        Object obj = hegVar.a;
        if (obj == null || senVar == null) {
            optionalEmpty = Optional.empty();
        } else {
            hegVar.a = null;
            smc smcVar = senVar.a;
            if (smcVar != null) {
                sgm sgmVar = senVar.b;
                if (!smcVar.A() ? sgmVar != sgm.VIDEO_ERROR : sgmVar == sgm.USER_SKIPPED || sgmVar == sgm.USER_MUTED) {
                    optionalEmpty = Optional.empty();
                } else {
                    optionalEmpty = Optional.ofNullable(obj);
                }
            } else {
                optionalEmpty = Optional.empty();
            }
        }
        if (optionalEmpty.isPresent()) {
            jnjVar.b((amzh) optionalEmpty.get());
        }
    }
}
