package defpackage;

import com.google.research.xeno.effect.Callbacks$StatusCallback;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.EventManager;
import com.google.research.xeno.effect.FilterProcessorBase;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class attj implements Callbacks$StatusCallback {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ attj(FilterProcessorBase filterProcessorBase, Effect effect, Callbacks$StatusCallback callbacks$StatusCallback, int i) {
        this.$cid = i;
        this.a = filterProcessorBase;
        this.b = effect;
        this.c = callbacks$StatusCallback;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [com.google.research.xeno.effect.Callbacks$StatusCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.lang.Object, java.util.List] */
    @Override // com.google.research.xeno.effect.NativeCallbacks$StatusCallback
    public final void onCompletion(boolean z, String str) {
        long j;
        if (this.$cid == 0) {
            Object obj = this.a;
            if (z) {
                ((FilterProcessorBase) obj).a = (Effect) this.b;
            } else if (!str.equals("xeno::effect::EffectWasReconfiguredStatus()")) {
                ((FilterProcessorBase) obj).a = null;
            }
            this.c.onCompletion(z, str);
            return;
        }
        rht rhtVar = (rht) this.c;
        agke agkeVar = rhtVar.p;
        rhtVar.g.set(null);
        Object obj2 = this.a;
        if (z) {
            ?? r13 = this.b;
            rhtVar.p = (agke) r13;
            EventManager eventManagerG = rhtVar.d.g();
            int size = r13.size();
            for (int i = 0; i < size; i++) {
                qvk qvkVar = (qvk) r13.get(i);
                if (qvkVar instanceof qvn) {
                    aihf aihfVarCreateBuilder = aifv.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    ((aifv) aihfVarCreateBuilder.instance).b = "type.googleapis.com/xeno.effect.LoadStateRequestEventProto";
                    aihf aihfVarCreateBuilder2 = atwe.a.createBuilder();
                    String str2 = ((qvn) qvkVar).b;
                    aihfVarCreateBuilder2.copyOnWrite();
                    atwe atweVar = (atwe) aihfVarCreateBuilder2.instance;
                    str2.getClass();
                    atweVar.b = str2;
                    aigj byteString = ((atwe) aihfVarCreateBuilder2.build()).toByteString();
                    aihfVarCreateBuilder.copyOnWrite();
                    ((aifv) aihfVarCreateBuilder.instance).c = byteString;
                    atqo.a(eventManagerG.c, new atvl(eventManagerG, (aifv) aihfVarCreateBuilder.build(), 1));
                }
            }
            Optional optional = rhtVar.f;
            if (true == optional.isPresent()) {
                ((rbr) optional.get()).d();
            }
        } else if (!str.equals("xeno::effect::EffectWasReconfiguredStatus()") && !str.equals("xeno::effect::StartProcessingWasCancelledStatus()")) {
            rhtVar.p = agpi.a;
            Optional optional2 = rhtVar.f;
            if (true == optional2.isPresent()) {
                rbr rbrVar = (rbr) optional2.get();
                rbrVar.c(asjv.a);
                rbrVar.d();
            }
        }
        if (rhtVar.d instanceof rhb) {
            rht.p(agkeVar);
        }
        rhj rhjVar = (rhj) obj2;
        Object obj3 = rhjVar.b;
        Object obj4 = rhjVar.a;
        rht rhtVar2 = (rht) obj3;
        synchronized (rhtVar2.j) {
            j = ((rht) obj3).k;
        }
        rhtVar2.h.set(j);
        rhtVar2.l();
        if (z) {
            ((aqi) obj4).b(null);
        } else if (str.equals("xeno::effect::EffectWasReconfiguredStatus()") || str.equals("xeno::effect::StartProcessingWasCancelledStatus()")) {
            ((aqi) obj4).c();
        } else {
            ((aqi) obj4).d(new IllegalStateException(String.format("setEffect() failed with error: %s", str)));
        }
    }

    public /* synthetic */ attj(rht rhtVar, agke agkeVar, Callbacks$StatusCallback callbacks$StatusCallback, int i) {
        this.$cid = i;
        this.c = rhtVar;
        this.b = agkeVar;
        this.a = callbacks$StatusCallback;
    }
}
