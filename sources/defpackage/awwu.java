package defpackage;

import java.net.Inet4Address;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awwu implements awqg {
    private final /* synthetic */ int $cid;
    public static final awwu b = new awwu(1);
    public static final awwu a = new awwu(0);

    public awwu(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        return this.$cid != 0 ? Boolean.valueOf(obj instanceof Inet4Address) : Boolean.valueOf(obj instanceof awph);
    }
}
