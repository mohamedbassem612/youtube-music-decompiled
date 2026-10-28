package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c3 extends d3 {
    public final /* synthetic */ byte m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(a aVar, int i, byte b) {
        super(aVar, i);
        this.m = b;
    }

    @Override // j$.util.stream.a
    public final boolean n() {
        switch (this.m) {
            case 0:
                return true;
            default:
                return false;
        }
    }
}
