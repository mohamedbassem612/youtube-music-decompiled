package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.blocks.runtime.InstanceProxy;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iay implements Consumer {
    public final /* synthetic */ aihf a;
    public final /* synthetic */ gmj b;

    public /* synthetic */ iay(gmj gmjVar, aihf aihfVar) {
        this.b = gmjVar;
        this.a = aihfVar;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [agfr, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        ales alesVar;
        alvt alvtVar = (alvt) obj;
        aoqd aoqdVar = alvtVar.e;
        if (aoqdVar == null) {
            aoqdVar = aoqd.a;
        }
        if ((aoqdVar.c & 1073741824) != 0) {
            aoqd aoqdVar2 = alvtVar.e;
            if (aoqdVar2 == null) {
                aoqdVar2 = aoqd.a;
            }
            alesVar = aoqdVar2.J;
            if (alesVar == null) {
                alesVar = ales.a;
            }
        } else {
            aihf aihfVarCreateBuilder = ales.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ales alesVar2 = (ales) aihfVarCreateBuilder.instance;
            alesVar2.b |= 1;
            alesVar2.c = 50;
            aihfVarCreateBuilder.copyOnWrite();
            ales alesVar3 = (ales) aihfVarCreateBuilder.instance;
            alesVar3.b |= 2;
            alesVar3.d = 200;
            aihfVarCreateBuilder.copyOnWrite();
            ales alesVar4 = (ales) aihfVarCreateBuilder.instance;
            alesVar4.b |= 4;
            alesVar4.e = 5;
            aler alerVar = aler.a;
            aihf aihfVarCreateBuilder2 = alerVar.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aler alerVar2 = (aler) aihfVarCreateBuilder2.instance;
            alerVar2.b |= 2;
            alerVar2.d = 80;
            aihfVarCreateBuilder2.copyOnWrite();
            aler alerVar3 = (aler) aihfVarCreateBuilder2.instance;
            alerVar3.b |= 1;
            alerVar3.c = "0.8";
            aihfVarCreateBuilder.aX((aler) aihfVarCreateBuilder2.build());
            aihf aihfVarCreateBuilder3 = alerVar.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            aler alerVar4 = (aler) aihfVarCreateBuilder3.instance;
            alerVar4.b |= 2;
            alerVar4.d = 100;
            aihfVarCreateBuilder3.copyOnWrite();
            aler alerVar5 = (aler) aihfVarCreateBuilder3.instance;
            alerVar5.b |= 1;
            alerVar5.c = "1";
            aihfVarCreateBuilder.aX((aler) aihfVarCreateBuilder3.build());
            aihf aihfVarCreateBuilder4 = alerVar.createBuilder();
            aihfVarCreateBuilder4.copyOnWrite();
            aler alerVar6 = (aler) aihfVarCreateBuilder4.instance;
            alerVar6.b |= 2;
            alerVar6.d = 120;
            aihfVarCreateBuilder4.copyOnWrite();
            aler alerVar7 = (aler) aihfVarCreateBuilder4.instance;
            alerVar7.b |= 1;
            alerVar7.c = "1.2";
            aihfVarCreateBuilder.aX((aler) aihfVarCreateBuilder4.build());
            aihf aihfVarCreateBuilder5 = alerVar.createBuilder();
            aihfVarCreateBuilder5.copyOnWrite();
            aler alerVar8 = (aler) aihfVarCreateBuilder5.instance;
            alerVar8.b |= 2;
            alerVar8.d = 150;
            aihfVarCreateBuilder5.copyOnWrite();
            aler alerVar9 = (aler) aihfVarCreateBuilder5.instance;
            alerVar9.b |= 1;
            alerVar9.c = "1.5";
            aihfVarCreateBuilder.aX((aler) aihfVarCreateBuilder5.build());
            aihf aihfVarCreateBuilder6 = alerVar.createBuilder();
            aihfVarCreateBuilder6.copyOnWrite();
            aler alerVar10 = (aler) aihfVarCreateBuilder6.instance;
            alerVar10.b |= 2;
            alerVar10.d = 180;
            aihfVarCreateBuilder6.copyOnWrite();
            aler alerVar11 = (aler) aihfVarCreateBuilder6.instance;
            alerVar11.b |= 1;
            alerVar11.c = "1.8";
            aihfVarCreateBuilder.aX((aler) aihfVarCreateBuilder6.build());
            aihf aihfVarCreateBuilder7 = alerVar.createBuilder();
            aihfVarCreateBuilder7.copyOnWrite();
            aler alerVar12 = (aler) aihfVarCreateBuilder7.instance;
            alerVar12.b |= 2;
            alerVar12.d = 200;
            aihfVarCreateBuilder7.copyOnWrite();
            aler alerVar13 = (aler) aihfVarCreateBuilder7.instance;
            alerVar13.b |= 1;
            alerVar13.c = "2";
            aihfVarCreateBuilder.aX((aler) aihfVarCreateBuilder7.build());
            alesVar = (ales) aihfVarCreateBuilder.build();
        }
        gmj gmjVar = this.b;
        agbo agboVar = (agbo) gmjVar.a.io();
        aihf aihfVarCreateBuilder8 = aooz.a.createBuilder();
        float f = alesVar.c;
        aihfVarCreateBuilder8.copyOnWrite();
        aooz aoozVar = (aooz) aihfVarCreateBuilder8.instance;
        aoozVar.b |= 4;
        aoozVar.c = f / 100.0f;
        float f2 = alesVar.d;
        aihfVarCreateBuilder8.copyOnWrite();
        aooz aoozVar2 = (aooz) aihfVarCreateBuilder8.instance;
        aoozVar2.b |= 8;
        aoozVar2.d = f2 / 100.0f;
        float f3 = alesVar.e;
        aihfVarCreateBuilder8.copyOnWrite();
        aooz aoozVar3 = (aooz) aihfVarCreateBuilder8.instance;
        aoozVar3.b |= SemanticState.LiveRegion;
        aoozVar3.i = f3 / 100.0f;
        askp askpVar = askp.a;
        aihf aihfVarCreateBuilder9 = askpVar.createBuilder();
        Context context = (Context) gmjVar.f;
        String string = context.getString(R.string.normal_playback_rate_label);
        aihfVarCreateBuilder9.copyOnWrite();
        askp askpVar2 = (askp) aihfVarCreateBuilder9.instance;
        string.getClass();
        askpVar2.b |= 1;
        askpVar2.c = string;
        askp askpVar3 = (askp) aihfVarCreateBuilder9.build();
        aihfVarCreateBuilder8.copyOnWrite();
        aooz aoozVar4 = (aooz) aihfVarCreateBuilder8.instance;
        askpVar3.getClass();
        aoozVar4.j = askpVar3;
        aoozVar4.b |= SemanticState.ReadOnly;
        aihf aihfVarCreateBuilder10 = askpVar.createBuilder();
        String string2 = context.getString(R.string.recently_selected_playback_rate_label);
        aihfVarCreateBuilder10.copyOnWrite();
        askp askpVar4 = (askp) aihfVarCreateBuilder10.instance;
        string2.getClass();
        askpVar4.b |= 1;
        askpVar4.c = string2;
        askp askpVar5 = (askp) aihfVarCreateBuilder10.build();
        aihfVarCreateBuilder8.copyOnWrite();
        aooz aoozVar5 = (aooz) aihfVarCreateBuilder8.instance;
        askpVar5.getClass();
        aoozVar5.k = askpVar5;
        aoozVar5.b |= SemanticState.Modal;
        String string3 = context.getString(R.string.accessibility_increase_playback_speed);
        aihfVarCreateBuilder8.copyOnWrite();
        aooz aoozVar6 = (aooz) aihfVarCreateBuilder8.instance;
        string3.getClass();
        aoozVar6.b |= 16;
        aoozVar6.e = string3;
        String string4 = context.getString(R.string.accessibility_increment_button_max_limit_reached);
        aihfVarCreateBuilder8.copyOnWrite();
        aooz aoozVar7 = (aooz) aihfVarCreateBuilder8.instance;
        string4.getClass();
        aoozVar7.b |= 32;
        aoozVar7.f = string4;
        String string5 = context.getString(R.string.accessibility_decrease_playback_speed);
        aihfVarCreateBuilder8.copyOnWrite();
        aooz aoozVar8 = (aooz) aihfVarCreateBuilder8.instance;
        string5.getClass();
        aoozVar8.b |= 64;
        aoozVar8.g = string5;
        String string6 = context.getString(R.string.accessibility_decrement_button_min_limit_reached);
        aihfVarCreateBuilder8.copyOnWrite();
        aooz aoozVar9 = (aooz) aihfVarCreateBuilder8.instance;
        string6.getClass();
        aoozVar9.b |= SemanticState.Focused;
        aoozVar9.h = string6;
        for (aler alerVar14 : alesVar.f) {
            float f4 = alerVar14.d / 100.0f;
            String str = alerVar14.c;
            aihf aihfVarCreateBuilder11 = aooy.a.createBuilder();
            aihf aihfVarCreateBuilder12 = askpVar.createBuilder();
            aihfVarCreateBuilder12.copyOnWrite();
            askp askpVar6 = (askp) aihfVarCreateBuilder12.instance;
            str.getClass();
            askpVar6.b |= 1;
            askpVar6.c = str;
            askp askpVar7 = (askp) aihfVarCreateBuilder12.build();
            aihfVarCreateBuilder11.copyOnWrite();
            aooy aooyVar = (aooy) aihfVarCreateBuilder11.instance;
            askpVar7.getClass();
            aooyVar.d = askpVar7;
            aooyVar.c |= 1;
            aihf aihfVarCreateBuilder13 = appk.a.createBuilder();
            aihfVarCreateBuilder13.copyOnWrite();
            appk appkVar = (appk) aihfVarCreateBuilder13.instance;
            appkVar.b = 6;
            appkVar.c = Float.valueOf(f4);
            appk appkVar2 = (appk) aihfVarCreateBuilder13.build();
            aihfVarCreateBuilder11.copyOnWrite();
            aooy aooyVar2 = (aooy) aihfVarCreateBuilder11.instance;
            appkVar2.getClass();
            aooyVar2.e = appkVar2;
            aooyVar2.c |= 2;
            aihh aihhVar = (aihh) apjj.a.createBuilder();
            aihl aihlVar = aiqc.b;
            aihf aihfVarCreateBuilder14 = aiqc.a.createBuilder();
            aihfVarCreateBuilder14.copyOnWrite();
            aiqc aiqcVar = (aiqc) aihfVarCreateBuilder14.instance;
            str.getClass();
            aiqcVar.c |= 1;
            aiqcVar.d = str;
            aihhVar.e(aihlVar, (aiqc) aihfVarCreateBuilder14.build());
            aihfVarCreateBuilder11.copyOnWrite();
            aooy aooyVar3 = (aooy) aihfVarCreateBuilder11.instance;
            apjj apjjVar = (apjj) aihhVar.build();
            apjjVar.getClass();
            aooyVar3.f = apjjVar;
            aooyVar3.c |= 32;
            aooy aooyVar4 = (aooy) aihfVarCreateBuilder11.build();
            aihh aihhVar2 = (aihh) apji.a.createBuilder();
            aihhVar2.e(aooy.b, aooyVar4);
            apji apjiVar = (apji) aihhVar2.build();
            aihfVarCreateBuilder8.copyOnWrite();
            aooz aoozVar10 = (aooz) aihfVarCreateBuilder8.instance;
            apjiVar.getClass();
            aiie aiieVar = aoozVar10.l;
            if (!aiieVar.c()) {
                aoozVar10.l = aihn.mutableCopy(aiieVar);
            }
            aoozVar10.l.add(apjiVar);
        }
        if (alesVar.g) {
            aihf aihfVarCreateBuilder15 = aopa.a.createBuilder();
            aihf aihfVarCreateBuilder16 = askpVar.createBuilder();
            String string7 = context.getString(R.string.trim_silence_label);
            aihfVarCreateBuilder16.copyOnWrite();
            askp askpVar8 = (askp) aihfVarCreateBuilder16.instance;
            string7.getClass();
            askpVar8.b |= 1;
            askpVar8.c = string7;
            aihfVarCreateBuilder15.copyOnWrite();
            aopa aopaVar = (aopa) aihfVarCreateBuilder15.instance;
            askp askpVar9 = (askp) aihfVarCreateBuilder16.build();
            askpVar9.getClass();
            aopaVar.d = askpVar9;
            aopaVar.c |= 1;
            aihf aihfVarCreateBuilder17 = askpVar.createBuilder();
            String string8 = context.getString(R.string.trim_silence_description);
            aihfVarCreateBuilder17.copyOnWrite();
            askp askpVar10 = (askp) aihfVarCreateBuilder17.instance;
            string8.getClass();
            askpVar10.b |= 1;
            askpVar10.c = string8;
            aihfVarCreateBuilder15.copyOnWrite();
            aopa aopaVar2 = (aopa) aihfVarCreateBuilder15.instance;
            askp askpVar11 = (askp) aihfVarCreateBuilder17.build();
            askpVar11.getClass();
            aopaVar2.e = askpVar11;
            aopaVar2.c |= 2;
            String string9 = context.getString(R.string.accessibility_trim_silence_on);
            aihfVarCreateBuilder15.copyOnWrite();
            aopa aopaVar3 = (aopa) aihfVarCreateBuilder15.instance;
            string9.getClass();
            aopaVar3.c |= 4;
            aopaVar3.f = string9;
            String string10 = context.getString(R.string.accessibility_trim_silence_off);
            aihfVarCreateBuilder15.copyOnWrite();
            aopa aopaVar4 = (aopa) aihfVarCreateBuilder15.instance;
            string10.getClass();
            aopaVar4.c |= 8;
            aopaVar4.g = string10;
            aopa aopaVar5 = (aopa) aihfVarCreateBuilder15.build();
            aihh aihhVar3 = (aihh) apji.a.createBuilder();
            aihhVar3.e(aopa.b, aopaVar5);
            apji apjiVar2 = (apji) aihhVar3.build();
            aihfVarCreateBuilder8.copyOnWrite();
            aooz aoozVar11 = (aooz) aihfVarCreateBuilder8.instance;
            apjiVar2.getClass();
            aoozVar11.m = apjiVar2;
            aoozVar11.b |= SemanticState.Obscured;
        }
        aooz aoozVar12 = (aooz) aihfVarCreateBuilder8.build();
        InstanceProxy instanceProxyD = agboVar.d();
        if (instanceProxyD instanceof agbp) {
            agcv agcvVar = ((agbp) instanceProxyD).a;
        }
        aihf aihfVar = this.a;
        ajwo ajwoVar = ajwo.a;
        ajwo ajwoVar2 = (ajwo) agboVar.f(-599461955, aoozVar12, aihn.getParserForClass(ajwo.class));
        aihfVar.copyOnWrite();
        aorw aorwVar = (aorw) aihfVar.instance;
        aorw aorwVar2 = aorw.a;
        ajwoVar2.getClass();
        aorwVar.l = ajwoVar2;
        aorwVar.c |= 134217728;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
