package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mkv implements avng {
    private final /* synthetic */ int $cid;

    @Override // defpackage.avng
    public final boolean a(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((fhd) obj) == ((fhd) obj2);
        }
        if (i == 1) {
            return ((amae) obj).equals((amae) obj2);
        }
        if (i != 2) {
            return a.ae(obj, obj2);
        }
        int i2 = mrl.p;
        return Arrays.equals(((mrk) obj).a, ((mrk) obj2).a);
    }
}
