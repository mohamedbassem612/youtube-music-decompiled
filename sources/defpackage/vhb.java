package defpackage;

import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vhb implements dty {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public vhb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.dty
    public final void a(int i) {
        if (this.$cid != 0) {
            Iterator it = ((RtlAwareViewPager) this.a).i.iterator();
            while (it.hasNext()) {
                ((dty) it.next()).a(i);
            }
        }
    }

    @Override // defpackage.dty
    public final void b(int i, float f, int i2) {
        if (this.$cid != 0) {
            RtlAwareViewPager rtlAwareViewPager = (RtlAwareViewPager) this.a;
            Iterator it = rtlAwareViewPager.i.iterator();
            while (it.hasNext()) {
                ((dty) it.next()).b(rtlAwareViewPager.v(i), f, i2);
            }
        }
    }

    @Override // defpackage.dty
    public final void c(int i) {
        int i2 = this.$cid;
        Object obj = this.a;
        if (i2 != 0) {
            RtlAwareViewPager rtlAwareViewPager = (RtlAwareViewPager) obj;
            Iterator it = rtlAwareViewPager.i.iterator();
            while (it.hasNext()) {
                ((dty) it.next()).c(rtlAwareViewPager.v(i));
            }
            return;
        }
        vhc vhcVar = (vhc) obj;
        if (vhcVar.B.d() != 0) {
            vha vhaVar = vhcVar.C;
            vhaVar.getClass();
            vhk vhkVar = (vhk) vhaVar.p(i);
            if (!vhkVar.b) {
                vhcVar.o(true);
                vhcVar.p(i);
            }
            vhkVar.c.ab(0);
        }
    }
}
