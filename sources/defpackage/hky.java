package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hky implements hkz {
    static final long a;
    public final jnj b;
    public final jhl c;
    public boolean d;
    private final jki e;
    private final mbc f;
    private final Context g;
    private final avlh h;
    private final avmb i;
    private avmn j;
    private long k = -1;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        a = 600000L;
    }

    public hky(jki jkiVar, mbc mbcVar, Context context, avlh avlhVar, jnj jnjVar, avmb avmbVar, jhl jhlVar) {
        this.e = jkiVar;
        this.f = mbcVar;
        this.g = context;
        this.h = avlhVar;
        this.b = jnjVar;
        this.i = avmbVar;
        this.c = jhlVar;
    }

    private final alay d(int i) {
        return ackj.c(this.g.getString(i));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [hku, java.lang.Object] */
    @Override // defpackage.tts
    public final void a() {
        if (this.k == -1 || this.f.b() > this.k + a) {
            jki jkiVar = this.e;
            if (jkiVar.e.l(27, 45722447L, false) || jkiVar.f.l(53, 45785910L, false)) {
                Optional optionalC = jkiVar.c();
                if (true == optionalC.isPresent()) {
                    optionalC = Optional.ofNullable(Boolean.valueOf(optionalC.get().z()));
                }
                if (((Boolean) optionalC.orElse(Boolean.FALSE)).booleanValue()) {
                    return;
                }
            } else if (!jkiVar.h()) {
                return;
            }
            jnj jnjVar = this.b;
            aihf aihfVarCreateBuilder = amzh.a.createBuilder();
            alay alayVarD = d(R.string.offline_mealbar_title);
            aihfVarCreateBuilder.copyOnWrite();
            amzh amzhVar = (amzh) aihfVarCreateBuilder.instance;
            alayVarD.getClass();
            amzhVar.f = alayVarD;
            amzhVar.b |= SemanticState.Hidden;
            alay alayVarD2 = d(R.string.offline_mealbar_message);
            aihfVarCreateBuilder.copyOnWrite();
            amzh amzhVar2 = (amzh) aihfVarCreateBuilder.instance;
            alayVarD2.getClass();
            aiie aiieVar = amzhVar2.g;
            if (!aiieVar.c()) {
                amzhVar2.g = aihn.mutableCopy(aiieVar);
            }
            amzhVar2.g.add(alayVarD2);
            aihfVarCreateBuilder.copyOnWrite();
            amzh amzhVar3 = (amzh) aihfVarCreateBuilder.instance;
            amzhVar3.j = 1;
            amzhVar3.b |= 16384;
            amzg amzgVar = amzg.a;
            aihf aihfVarCreateBuilder2 = amzgVar.createBuilder();
            ajnf ajnfVar = ajnf.a;
            aihh aihhVar = (aihh) ajnfVar.createBuilder();
            alay alayVarD3 = d(R.string.offline_mealbar_downloads_dismiss_button_text);
            aihhVar.copyOnWrite();
            ajnf ajnfVar2 = (ajnf) aihhVar.instance;
            alayVarD3.getClass();
            ajnfVar2.m = alayVarD3;
            ajnfVar2.b |= 64;
            aihfVarCreateBuilder2.copyOnWrite();
            amzg amzgVar2 = (amzg) aihfVarCreateBuilder2.instance;
            ajnf ajnfVar3 = (ajnf) aihhVar.build();
            ajnfVar3.getClass();
            amzgVar2.c = ajnfVar3;
            amzgVar2.b |= 1;
            amzg amzgVar3 = (amzg) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            amzh amzhVar4 = (amzh) aihfVarCreateBuilder.instance;
            amzgVar3.getClass();
            amzhVar4.i = amzgVar3;
            amzhVar4.b |= SemanticState.ReadOnly;
            ajwo ajwoVarB = vxh.b("FEmusic_offline");
            aihf aihfVarCreateBuilder3 = amzgVar.createBuilder();
            aihh aihhVar2 = (aihh) ajnfVar.createBuilder();
            alay alayVarD4 = d(R.string.offline_mealbar_downloads_action_button_text);
            aihhVar2.copyOnWrite();
            ajnf ajnfVar4 = (ajnf) aihhVar2.instance;
            alayVarD4.getClass();
            ajnfVar4.m = alayVarD4;
            ajnfVar4.b |= 64;
            aihhVar2.copyOnWrite();
            ajnf ajnfVar5 = (ajnf) aihhVar2.instance;
            ajwoVarB.getClass();
            ajnfVar5.s = ajwoVarB;
            ajnfVar5.b |= SemanticState.Multiline;
            aihfVarCreateBuilder3.copyOnWrite();
            amzg amzgVar4 = (amzg) aihfVarCreateBuilder3.instance;
            ajnf ajnfVar6 = (ajnf) aihhVar2.build();
            ajnfVar6.getClass();
            amzgVar4.c = ajnfVar6;
            amzgVar4.b |= 1;
            amzg amzgVar5 = (amzg) aihfVarCreateBuilder3.build();
            aihfVarCreateBuilder.copyOnWrite();
            amzh amzhVar5 = (amzh) aihfVarCreateBuilder.instance;
            amzgVar5.getClass();
            amzhVar5.h = amzgVar5;
            amzhVar5.b |= SemanticState.LiveRegion;
            jnjVar.d((amzh) aihfVarCreateBuilder.build());
            this.k = this.f.b();
            this.d = true;
        }
    }

    @Override // defpackage.hkz
    public final void b() {
        this.j = this.h.p().L(this.i).al(new hjd(this, 13), new gfh(19));
    }

    @Override // defpackage.hkz
    public final void c() {
        Object obj = this.j;
        if (obj != null) {
            awka.f((AtomicReference) obj);
            this.j = null;
        }
    }
}
