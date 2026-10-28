package defpackage;

import android.widget.TextView;
import com.google.research.xeno.effect.Effect;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hly implements Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hly(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r4v6, types: [awmd, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final Object get() {
        snk snkVar;
        Object qvkVar;
        int i = 0;
        switch (this.$cid) {
            case 0:
                agke agkeVar = hlz.a;
                return Integer.valueOf(((anuk) this.a).getTrackCount().intValue());
            case 1:
                return (gdt) this.a.io();
            case 2:
            case 3:
                return ((hzg) this.a).b;
            case 4:
                return ((xit) ((igw) this.a).b.io()).n(4);
            case 5:
                return ahwo.a((ahws) ((agke) this.a).get(0));
            case 6:
                jon jonVar = (jon) this.a;
                anvo anvoVar = jonVar.q;
                qvkVar = anvoVar;
                if (anvoVar == null) {
                    anvo anvoVarH = hna.h(jonVar.e, jonVar.l, jonVar.m, null);
                    jonVar.q = anvoVarH;
                    qvkVar = anvoVarH;
                }
                return qvkVar;
            case 7:
                rhh rhhVar = (rhh) this.a;
                if (rhhVar.d == null) {
                    rhhVar.d = new atwd(atwd.nativeCreateHandle());
                }
                return rhhVar.d;
            case 8:
                rhh rhhVar2 = (rhh) this.a;
                if (rhhVar2.e == null) {
                    rhhVar2.e = new atwc(atwc.nativeCreateHandle());
                }
                return rhhVar2.e;
            case 9:
                return ((TextView) this.a).getTextColors();
            case 10:
                do {
                    agke agkeVar2 = ((smr) this.a).d;
                    if (i >= ((agpi) agkeVar2).d) {
                        return "";
                    }
                    snkVar = (snk) agkeVar2.get(i);
                    i++;
                } while (!(snkVar instanceof skv));
                return ((skv) snkVar).a;
            case 11:
                return ahng.m((Throwable) this.a);
            case 12:
                qvkVar = new qvk((Effect) this.a);
                return qvkVar;
            case 13:
                auir auirVar = vkn.a;
                return ackm.YOUTUBE_SANS_BOLD.c(((vkl) this.a).a, 1);
            case 14:
                return Float.valueOf((float) ((zhl) this.a).i.b(2, 45726784L));
            case 15:
                return nra.b(agke.q(this.a), null);
            case 16:
                aoqs aoqsVar = ((aapa) this.a).d.b().k;
                if (aoqsVar == null) {
                    aoqsVar = aoqs.a;
                }
                return Integer.valueOf((int) ((aoqsVar.b & 262144) != 0 ? aoqsVar.i : 1000L));
            case 17:
                return tzk.b(((abrj) this.a).a(abpg.class).h(wjf.class).ao());
            default:
                return tzk.b(((abrj) this.a).a(acsx.class).h(acrx.class).ao());
        }
    }
}
