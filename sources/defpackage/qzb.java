package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.research.xeno.effect.Effect;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qzb implements aqk {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qzb(adxp adxpVar, asih asihVar, acjx acjxVar, int i) {
        this.$cid = i;
        this.a = adxpVar;
        this.c = asihVar;
        this.b = acjxVar;
    }

    /* JADX WARN: Type inference failed for: r13v22, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r1v7, types: [acjx, java.lang.Object] */
    @Override // defpackage.aqk
    public final Object a(final aqi aqiVar) {
        adtv adtvVar;
        ahsx ahsxVarAK;
        int i = this.$cid;
        int i2 = 0;
        if (i == 0) {
            String string = Integer.toString(this.a.hashCode());
            qzd qzdVar = new qzd(aqiVar, i2);
            qzf qzfVar = (qzf) this.b;
            Context context = qzfVar.a;
            Object obj = this.c;
            try {
                try {
                    InputStream inputStreamOpen = context.getAssets().open((String) obj);
                    byte[] bArrB = agyi.b(inputStreamOpen);
                    inputStreamOpen.close();
                    qzfVar.c.a((String) obj, "", string, (atte) aihn.parseFrom(atte.a, bArrB, ExtensionRegistryLite.getGeneratedRegistry()), qzdVar);
                    return null;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (aiik e2) {
                qzdVar.a(null, e2.getMessage());
                return null;
            }
        }
        if (i == 1) {
            Object obj2 = this.c;
            Object obj3 = this.a;
            Object obj4 = this.b;
            ((axnp) obj4).c.execute(new mrh(obj4, obj3, aqiVar, obj2, 2, (short[]) null));
            return "";
        }
        if (i != 2) {
            if (i == 3) {
                xls xlsVar = (xls) this.b;
                xlsVar.f.offerLast(new xlr((xvu) this.a, (xvy) this.c, xlsVar.b.f(), aqiVar));
                xlsVar.g();
                return null;
            }
            if (i == 4) {
                this.c.execute(afwl.i(new adfe((asnm) this.a, (Context) this.b, aqiVar)));
                return "LocalImageLoader.DecodeImageDataTask";
            }
            Object obj5 = this.a;
            synchronized (obj5) {
                ((adxp) obj5).e = aqiVar;
            }
            synchronized (obj5) {
                adtvVar = !((adxp) obj5).e() ? ((adxp) obj5).c : null;
            }
            if (adtvVar != null) {
                ?? r1 = this.b;
                Object obj6 = this.c;
                adtn adtnVarA = adto.a(r1);
                adtnVarA.c = new adxm(obj6, i2);
                adxp adxpVar = (adxp) obj5;
                adtnVarA.d = agev.i(new adxn(adxpVar, aqiVar));
                adto adtoVarA = adtnVarA.a();
                if (adxpVar.b) {
                    adtn adtnVar = new adtn(adtoVarA);
                    adtnVar.c(true);
                    ahsxVarAK = adtvVar.aK(adtnVar.a());
                } else {
                    ahsxVarAK = adtvVar.aK(adtoVarA);
                }
                synchronized (obj5) {
                    ((adxp) obj5).f = ahsxVarAK;
                }
                return "SectionListContinuationControllerBlock";
            }
            synchronized (obj5) {
                if (((adxp) obj5).e == aqiVar) {
                    ((adxp) obj5).e = null;
                }
            }
            ((adxp) obj5).a.set(false);
            aihf aihfVarCreateBuilder = asii.a.createBuilder();
            aihf aihfVarCreateBuilder2 = atxp.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            ((atxp) aihfVarCreateBuilder2.instance).b = 9;
            aihfVarCreateBuilder2.copyOnWrite();
            ((atxp) aihfVarCreateBuilder2.instance).c = "Section list is disposed.";
            atxp atxpVar = (atxp) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            asii asiiVar = (asii) aihfVarCreateBuilder.instance;
            atxpVar.getClass();
            asiiVar.c = atxpVar;
            asiiVar.b |= 1;
            aqiVar.b((asii) aihfVarCreateBuilder.build());
            return "SectionListContinuationControllerBlock";
        }
        agkj agkjVar = qzu.a.b;
        Object obj7 = this.b;
        qzt qztVar = (qzt) agkjVar.get(obj7.getClass());
        qztVar.getClass();
        qzf qzfVar2 = (qzf) this.a;
        atte atteVarA = ((qzr) qztVar.apply(obj7, qzfVar2.d)).a();
        final qvc qvcVar = (qvc) obj7;
        String string2 = Integer.toString(qvcVar.c.hashCode());
        attc attcVar = new attc() { // from class: qza
            @Override // defpackage.attc
            public final void a(Effect effect, String str) {
                qvc radVar;
                int i3 = qzf.f;
                aqi aqiVar2 = aqiVar;
                if (effect == null) {
                    aqiVar2.d(new IllegalStateException(String.format("loadEffect() failed with error: %s", str)));
                    return;
                }
                qvc qvcVar2 = qvcVar;
                if (qvcVar2 instanceof qvi) {
                    radVar = new qzn(effect, qvcVar2.c);
                } else {
                    radVar = qvcVar2 instanceof qvh ? new rad(effect) : new qvk(effect);
                }
                radVar.h(qvcVar2.d);
                radVar.g(qvcVar2.e);
                radVar.g = qvcVar2.g;
                aqiVar2.b(radVar);
            }
        };
        Object obj8 = this.c;
        String str = (String) obj8;
        if (!str.isEmpty()) {
            atsf atsfVar = atteVarA.n;
            if (atsfVar == null) {
                atsfVar = atsf.a;
            }
            if (atsfVar.b.size() <= 0) {
                throw new IllegalArgumentException(String.format("No asset exists in effect with given index: %d", 0));
            }
            atsf atsfVar2 = atteVarA.n;
            if (atsfVar2 == null) {
                atsfVar2 = atsf.a;
            }
            aihf builder = ((atsa) atsfVar2.b.get(0)).toBuilder();
            atsa atsaVar = (atsa) builder.instance;
            aihf builder2 = (atsaVar.c == 2 ? (atse) atsaVar.d : atse.a).toBuilder();
            if (str.startsWith("http") || str.startsWith("https")) {
                builder2.copyOnWrite();
                atse atseVar = (atse) builder2.instance;
                obj8.getClass();
                atseVar.c = 1;
                atseVar.d = obj8;
            } else {
                atsb atsbVar = ((atse) builder2.instance).e;
                if (atsbVar == null) {
                    atsbVar = atsb.a;
                }
                aihf builder3 = atsbVar.toBuilder();
                builder3.copyOnWrite();
                atsb atsbVar2 = (atsb) builder3.instance;
                obj8.getClass();
                atsbVar2.b |= 2;
                atsbVar2.e = str;
                atsb atsbVar3 = (atsb) builder3.build();
                builder2.copyOnWrite();
                atse atseVar2 = (atse) builder2.instance;
                atsbVar3.getClass();
                atseVar2.e = atsbVar3;
                atseVar2.b |= 1;
            }
            builder.copyOnWrite();
            atsa atsaVar2 = (atsa) builder.instance;
            atse atseVar3 = (atse) builder2.build();
            atseVar3.getClass();
            atsaVar2.d = atseVar3;
            atsaVar2.c = 2;
            aihh aihhVar = (aihh) atteVarA.toBuilder();
            atsf atsfVar3 = ((atte) aihhVar.instance).n;
            if (atsfVar3 == null) {
                atsfVar3 = atsf.a;
            }
            jrr jrrVar = (jrr) atsfVar3.toBuilder();
            jrrVar.copyOnWrite();
            atsf atsfVar4 = (atsf) jrrVar.instance;
            atsa atsaVar3 = (atsa) builder.build();
            atsaVar3.getClass();
            atsfVar4.a();
            atsfVar4.b.set(0, atsaVar3);
            aihhVar.copyOnWrite();
            atte atteVar = (atte) aihhVar.instance;
            atsf atsfVar5 = (atsf) jrrVar.build();
            atsfVar5.getClass();
            atteVar.n = atsfVar5;
            atteVar.b |= SemanticState.LiveRegion;
            atteVarA = (atte) aihhVar.build();
        }
        qzfVar2.c.a("", str, string2, atteVarA, attcVar);
        return null;
    }

    public /* synthetic */ qzb(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ qzb(Executor executor, asnm asnmVar, Context context, int i) {
        this.$cid = i;
        this.c = executor;
        this.a = asnmVar;
        this.b = context;
    }

    public /* synthetic */ qzb(qzf qzfVar, String str, Object obj, int i) {
        this.$cid = i;
        this.b = qzfVar;
        this.c = str;
        this.a = obj;
    }

    public /* synthetic */ qzb(qzf qzfVar, qvc qvcVar, String str, int i) {
        this.$cid = i;
        this.a = qzfVar;
        this.b = qvcVar;
        this.c = str;
    }
}
