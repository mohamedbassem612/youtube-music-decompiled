package j$.nio.file;

import java.nio.file.OpenOption;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l implements OpenOption {
    public final /* synthetic */ m a;

    public /* synthetic */ l(m mVar) {
        this.a = mVar;
    }

    public static /* synthetic */ OpenOption a(m mVar) {
        OpenOption openOptionE;
        if (mVar == null) {
            return null;
        }
        if (mVar instanceof k) {
            openOptionE = ((k) mVar).a;
        } else if (mVar instanceof LinkOption) {
            openOptionE = a.c((LinkOption) mVar);
        } else {
            if (!(mVar instanceof x)) {
                return new l(mVar);
            }
            openOptionE = a.e((x) mVar);
        }
        return openOptionE;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        m mVar = this.a;
        if (obj instanceof l) {
            obj = ((l) obj).a;
        }
        return mVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
