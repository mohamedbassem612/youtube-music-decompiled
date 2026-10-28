package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sbh extends sbk {
    public final awmd a;
    private final sae b;
    private final spv c;
    private final tld d;

    public sbh(awmd awmdVar, tld tldVar, sae saeVar, spv spvVar) {
        this.a = awmdVar;
        this.d = tldVar;
        this.b = saeVar;
        this.c = spvVar;
    }

    @Override // defpackage.sbk
    protected final agkz ac() {
        return agkz.t(sgl.class, sgh.class, sgg.class, sge.class, sgf.class);
    }

    public final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sni sniVar = (sni) it.next();
            sko skoVar = sniVar.d;
            if (skoVar != null) {
                snk snkVar = sniVar.b;
                agkj agkjVar = skoVar.l;
                if (agkjVar.containsKey(snkVar)) {
                    Iterator it2 = ((List) agkjVar.get(snkVar)).iterator();
                    while (it2.hasNext()) {
                        try {
                            this.d.d(this.b.a(sniVar.c, skoVar, sniVar.e, (aivk) it2.next(), snkVar.a()));
                        } catch (sat e) {
                            this.c.f(aixe.ADS_CLIENT_EVENT_TYPE_ERROR, sniVar.c, sniVar.d, null, null, 0, null, null, null, spv.b(13, e.b), null, false);
                        }
                    }
                }
            }
            rmp.m(sniVar.c, sniVar.d, "Ping migration no associated ping bindings for activated trigger: ".concat(String.valueOf(sniVar.b.a().name())));
        }
    }
}
