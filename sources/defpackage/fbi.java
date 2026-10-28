package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fbi implements eua {
    private final /* synthetic */ int $cid;
    private final Object a;
    private final Object b;

    public fbi(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [ewn, java.lang.Object] */
    @Override // defpackage.eua
    public final /* synthetic */ ewf a(Object obj, int i, int i2, ety etyVar) {
        boolean z;
        fbg fbgVar;
        ffi ffiVar;
        if (this.$cid != 0) {
            ewf ewfVarC = ((fca) this.a).c((Uri) obj, etyVar);
            if (ewfVarC == null) {
                return null;
            }
            return far.a(this.b, ((fbx) ewfVarC).c(), i, i2);
        }
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof fbg) {
            fbgVar = (fbg) inputStream;
            z = false;
        } else {
            z = true;
            fbgVar = new fbg(inputStream, (ewv) this.b);
        }
        boolean z2 = z;
        Queue queue = ffi.a;
        synchronized (queue) {
            ffiVar = (ffi) queue.poll();
        }
        if (ffiVar == null) {
            ffiVar = new ffi();
        }
        ffi ffiVar2 = ffiVar;
        ffiVar2.b = fbgVar;
        ffp ffpVar = new ffp(ffiVar2);
        fbh fbhVar = new fbh(fbgVar, ffiVar2);
        try {
            Object obj2 = this.a;
            ewf ewfVarA = ((fap) obj2).a(new faz(ffpVar, ((fap) obj2).h, ((fap) obj2).i), i, i2, etyVar, fbhVar);
        } finally {
            ffiVar2.a();
            if (z2) {
                fbgVar.b();
            }
        }
    }

    @Override // defpackage.eua
    public final /* synthetic */ boolean b(Object obj, ety etyVar) {
        if (this.$cid != 0) {
            return "android.resource".equals(((Uri) obj).getScheme());
        }
        return true;
    }
}
