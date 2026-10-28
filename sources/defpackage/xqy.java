package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xqy {
    public final /* synthetic */ Object a;

    public xqy(Object obj) {
        this.a = obj;
    }

    @tcc
    public void onMdxSessionStatusEvent(xzh xzhVar) {
        xzc xzcVar = xzhVar.a;
        boolean z = false;
        if (xzcVar != null && xzcVar.b() == 0) {
            z = true;
        }
        Object obj = this.a;
        xqz xqzVar = (xqz) obj;
        xqzVar.c = z;
        agrx agrxVar = agso.a;
        xqzVar.h();
        ((dhp) obj).gz(xqzVar.a());
    }

    @tcc
    public void onMdxVolumeChangedEvent(xzw xzwVar) {
        Object obj = this.a;
        xqz xqzVar = (xqz) obj;
        xqzVar.d = xzwVar.a;
        ((dhp) obj).gz(xqzVar.a());
    }
}
