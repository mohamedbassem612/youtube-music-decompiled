package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Collection;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jlb {
    public static final ajwo a;
    public final hcb b;
    private final Context c;

    static {
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(annj.a, anni.a);
        a = (ajwo) aihhVar.build();
    }

    public jlb(Context context, hcb hcbVar) {
        this.c = context;
        this.b = hcbVar;
    }

    public final anxn a(List list, String str, int i) {
        agke agkeVar = (agke) Collection.EL.stream(list).map(new hph(this, list, 13)).collect(aghu.a);
        apji apjiVar = apji.a;
        aihh aihhVar = (aihh) apjiVar.createBuilder();
        aihl aihlVar = ajnp.a;
        aihh aihhVar2 = (aihh) ajnf.a.createBuilder();
        ajwo ajwoVar = a;
        aihhVar2.copyOnWrite();
        ajnf ajnfVar = (ajnf) aihhVar2.instance;
        ajwoVar.getClass();
        ajnfVar.s = ajwoVar;
        ajnfVar.b |= SemanticState.Multiline;
        alja aljaVar = alja.a;
        aihh aihhVar3 = (aihh) aljaVar.createBuilder();
        aliz alizVar = aliz.CLOSE;
        aihhVar3.copyOnWrite();
        alja aljaVar2 = (alja) aihhVar3.instance;
        aljaVar2.c = alizVar.yN;
        aljaVar2.b |= 1;
        aihhVar2.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar2.instance;
        alja aljaVar3 = (alja) aihhVar3.build();
        aljaVar3.getClass();
        ajnfVar2.f = aljaVar3;
        ajnfVar2.e = 8;
        aihf aihfVarCreateBuilder = aiqe.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aiqd.a.createBuilder();
        String string = this.c.getString(R.string.accessibility_close);
        aihfVarCreateBuilder2.copyOnWrite();
        aiqd aiqdVar = (aiqd) aihfVarCreateBuilder2.instance;
        string.getClass();
        aiqdVar.b |= 2;
        aiqdVar.c = string;
        aihfVarCreateBuilder.copyOnWrite();
        aiqe aiqeVar = (aiqe) aihfVarCreateBuilder.instance;
        aiqd aiqdVar2 = (aiqd) aihfVarCreateBuilder2.build();
        aiqdVar2.getClass();
        aiqeVar.c = aiqdVar2;
        aiqeVar.b |= 1;
        aihhVar2.copyOnWrite();
        ajnf ajnfVar3 = (ajnf) aihhVar2.instance;
        aiqe aiqeVar2 = (aiqe) aihfVarCreateBuilder.build();
        aiqeVar2.getClass();
        ajnfVar3.v = aiqeVar2;
        ajnfVar3.b |= 262144;
        aihhVar.e(aihlVar, (ajnf) aihhVar2.build());
        apji apjiVar2 = (apji) aihhVar.build();
        aihf aihfVarCreateBuilder3 = anrw.a.createBuilder();
        aihh aihhVar4 = (aihh) apjiVar.createBuilder();
        aihl aihlVar2 = anrq.a;
        aihf aihfVarCreateBuilder4 = anrp.a.createBuilder();
        alay alayVarD = ackj.d(str);
        aihfVarCreateBuilder4.copyOnWrite();
        anrp anrpVar = (anrp) aihfVarCreateBuilder4.instance;
        alayVarD.getClass();
        anrpVar.c = alayVarD;
        anrpVar.b |= 1;
        aihfVarCreateBuilder4.copyOnWrite();
        anrp anrpVar2 = (anrp) aihfVarCreateBuilder4.instance;
        apjiVar2.getClass();
        aiie aiieVar = anrpVar2.g;
        if (!aiieVar.c()) {
            anrpVar2.g = aihn.mutableCopy(aiieVar);
        }
        anrpVar2.g.add(apjiVar2);
        aihhVar4.e(aihlVar2, (anrp) aihfVarCreateBuilder4.build());
        aihfVarCreateBuilder3.copyOnWrite();
        anrw anrwVar = (anrw) aihfVarCreateBuilder3.instance;
        apji apjiVar3 = (apji) aihhVar4.build();
        apjiVar3.getClass();
        anrwVar.c = apjiVar3;
        anrwVar.b |= 1;
        aihfVarCreateBuilder3.copyOnWrite();
        anrw anrwVar2 = (anrw) aihfVarCreateBuilder3.instance;
        aiie aiieVar2 = anrwVar2.d;
        if (!aiieVar2.c()) {
            anrwVar2.d = aihn.mutableCopy(aiieVar2);
        }
        aifs.addAll(agkeVar, anrwVar2.d);
        anrw anrwVar3 = (anrw) aihfVarCreateBuilder3.build();
        aihf aihfVarCreateBuilder5 = anxn.a.createBuilder();
        aihh aihhVar5 = (aihh) aljaVar.createBuilder();
        aliz alizVar2 = aliz.ARROW_DROP_DOWN;
        aihhVar5.copyOnWrite();
        alja aljaVar4 = (alja) aihhVar5.instance;
        aljaVar4.c = alizVar2.yN;
        aljaVar4.b |= 1;
        aihfVarCreateBuilder5.copyOnWrite();
        anxn anxnVar = (anxn) aihfVarCreateBuilder5.instance;
        alja aljaVar5 = (alja) aihhVar5.build();
        aljaVar5.getClass();
        anxnVar.d = aljaVar5;
        anxnVar.b |= 2;
        aihh aihhVar6 = (aihh) apjiVar.createBuilder();
        aihhVar6.e(anrx.a, anrwVar3);
        aihfVarCreateBuilder5.copyOnWrite();
        anxn anxnVar2 = (anxn) aihfVarCreateBuilder5.instance;
        apji apjiVar4 = (apji) aihhVar6.build();
        apjiVar4.getClass();
        anxnVar2.g = apjiVar4;
        anxnVar2.b |= 16;
        AtomicReference atomicReference = new AtomicReference();
        Optional optionalFindFirst = Collection.EL.stream(list).filter(new iui(18)).findFirst();
        jfn jfnVar = new jfn(atomicReference, 4);
        if (true == optionalFindFirst.isPresent()) {
            ((AtomicReference) jfnVar.a).set(((jla) optionalFindFirst.get()).a);
        }
        if (atomicReference.get() != null) {
            alay alayVarD2 = ackj.d((String) atomicReference.get());
            aihfVarCreateBuilder5.copyOnWrite();
            anxn anxnVar3 = (anxn) aihfVarCreateBuilder5.instance;
            alayVarD2.getClass();
            anxnVar3.c = alayVarD2;
            anxnVar3.b |= 1;
        }
        aihfVarCreateBuilder5.copyOnWrite();
        anxn anxnVar4 = (anxn) aihfVarCreateBuilder5.instance;
        anxnVar4.e = 2;
        anxnVar4.b |= 4;
        aihfVarCreateBuilder5.copyOnWrite();
        anxn anxnVar5 = (anxn) aihfVarCreateBuilder5.instance;
        anxnVar5.f = i - 1;
        anxnVar5.b |= 8;
        return (anxn) aihfVarCreateBuilder5.build();
    }
}
