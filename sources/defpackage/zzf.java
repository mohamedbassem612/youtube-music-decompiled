package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zzf {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/net/signal/StableNetworkSignalProvider");
    public final avlh b;
    public volatile aobh c = aobh.NETWORK_QUALITY_BUCKET_UNKNOWN;

    public zzf(awmd awmdVar, vxz vxzVar, avmb avmbVar) {
        iqb iqbVar = new iqb(awmdVar, vxzVar, avmbVar, 12);
        int i = avlh.a;
        avss avssVar = new avss(iqbVar);
        avnn avnnVar = atqp.j;
        avlh avlhVarC = avssVar.ax().c();
        this.b = avlhVarC;
        avlhVarC.al(new xwu(this, 10), new jop(13));
    }
}
