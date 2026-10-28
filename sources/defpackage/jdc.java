package defpackage;

import android.text.style.ClickableSpan;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jdc implements ackf {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ jdc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, vxe] */
    @Override // defpackage.ackf
    public final ClickableSpan a(ajwo ajwoVar) {
        switch (this.$cid) {
            case 0:
                jde jdeVar = (jde) this.a;
                return new xhh(jdeVar.x, ajwoVar, false, jdeVar.v.i());
            case 1:
                jdb jdbVar = (jdb) this.a;
                return new xhh(jdbVar.a, ajwoVar, false, jdbVar.d.i());
            case 2:
                jde jdeVar2 = (jde) this.a;
                return new xhh(jdeVar2.x, ajwoVar, true, jdeVar2.v.i());
            case 3:
                return vxj.a(false).a(((jeb) this.a).a, agkj.j("always_launch_in_browser", Boolean.TRUE), ajwoVar);
            case 4:
                return vxj.a(false).a(((xta) this.a).c, agkj.j("always_launch_in_browser", Boolean.TRUE), ajwoVar);
            case 5:
                return vxj.a(false).a((vxe) ((jon) this.a).d.io(), null, ajwoVar);
            case 6:
                return vxj.a(false).a((vxe) ((jon) this.a).d.io(), null, ajwoVar);
            case 7:
                return new vxj((vxe) ((joz) this.a).H.io(), null, ajwoVar, false);
            default:
                upo upoVar = (upo) this.a;
                return new xhh(upoVar.g, ajwoVar, false, upoVar.h.i());
        }
    }
}
