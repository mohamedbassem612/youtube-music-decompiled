package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jch extends jbi {
    public final vxe e;
    public final acwq f;
    private final Context g;

    public jch(Context context, aduv aduvVar, adxj adxjVar, acwq acwqVar, vxe vxeVar) {
        super(context, aduvVar, adxjVar);
        this.g = context;
        this.f = acwqVar;
        this.e = vxeVar;
    }

    public static final Spanned i(alhu alhuVar) {
        alay alayVar;
        if ((alhuVar.b & 2) != 0) {
            alayVar = alhuVar.f;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        return ackj.k(null, alayVar, null, false);
    }

    @Override // defpackage.jbi, defpackage.adma
    public final void b(admh admhVar) {
        super.b(admhVar);
        this.b.setOnLongClickListener(null);
    }

    @Override // defpackage.jbi, defpackage.admr
    public final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        super.d(adlyVar, (alhu) obj);
        this.b.setOnLongClickListener(new View.OnLongClickListener() { // from class: jcf
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                acwu acwuVarA = acwv.a();
                acwuVarA.b(true);
                aihf aihfVarCreateBuilder = akdd.a.createBuilder();
                jch jchVar = this.a;
                alay alayVarD = ackj.d(jch.i((alhu) jchVar.c).toString());
                aihfVarCreateBuilder.copyOnWrite();
                akdd akddVar = (akdd) aihfVarCreateBuilder.instance;
                alayVarD.getClass();
                akddVar.c = alayVarD;
                akddVar.b |= 1;
                aihfVarCreateBuilder.aR(jchVar.h(R.string.remove_search_suggestion));
                ajng ajngVar = ajng.a;
                aihf aihfVarCreateBuilder2 = ajngVar.createBuilder();
                ajnf ajnfVar = ajnf.a;
                aihh aihhVar = (aihh) ajnfVar.createBuilder();
                alay alayVarH = jchVar.h(R.string.remove);
                aihhVar.copyOnWrite();
                ajnf ajnfVar2 = (ajnf) aihhVar.instance;
                alayVarH.getClass();
                ajnfVar2.m = alayVarH;
                ajnfVar2.b |= 64;
                aihhVar.copyOnWrite();
                ajnf ajnfVar3 = (ajnf) aihhVar.instance;
                ajnfVar3.d = 42;
                ajnfVar3.c = 1;
                aihfVarCreateBuilder2.copyOnWrite();
                ajng ajngVar2 = (ajng) aihfVarCreateBuilder2.instance;
                ajnf ajnfVar4 = (ajnf) aihhVar.build();
                ajnfVar4.getClass();
                ajngVar2.c = ajnfVar4;
                ajngVar2.b |= 1;
                ajng ajngVar3 = (ajng) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                akdd akddVar2 = (akdd) aihfVarCreateBuilder.instance;
                ajngVar3.getClass();
                akddVar2.g = ajngVar3;
                akddVar2.b |= 64;
                aihf aihfVarCreateBuilder3 = ajngVar.createBuilder();
                aihh aihhVar2 = (aihh) ajnfVar.createBuilder();
                alay alayVarH2 = jchVar.h(android.R.string.cancel);
                aihhVar2.copyOnWrite();
                ajnf ajnfVar5 = (ajnf) aihhVar2.instance;
                alayVarH2.getClass();
                ajnfVar5.m = alayVarH2;
                ajnfVar5.b |= 64;
                aihhVar2.copyOnWrite();
                ajnf ajnfVar6 = (ajnf) aihhVar2.instance;
                ajnfVar6.d = 43;
                ajnfVar6.c = 1;
                aihfVarCreateBuilder3.copyOnWrite();
                ajng ajngVar4 = (ajng) aihfVarCreateBuilder3.instance;
                ajnf ajnfVar7 = (ajnf) aihhVar2.build();
                ajnfVar7.getClass();
                ajngVar4.c = ajnfVar7;
                ajngVar4.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                akdd akddVar3 = (akdd) aihfVarCreateBuilder.instance;
                ajng ajngVar5 = (ajng) aihfVarCreateBuilder3.build();
                ajngVar5.getClass();
                akddVar3.h = ajngVar5;
                akddVar3.b |= SemanticState.Focused;
                acwuVarA.d((akdd) aihfVarCreateBuilder.build());
                acwuVarA.a = new jcg(jchVar, 0);
                jchVar.f.d(acwuVarA.a());
                return true;
            }
        });
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((alhu) obj).h.G();
    }

    @Override // defpackage.jbi
    public final /* bridge */ /* synthetic */ Spanned f(Object obj) {
        return i((alhu) obj);
    }

    @Override // defpackage.jbi
    public final /* synthetic */ alja g(Object obj) {
        alja aljaVar = ((alhu) obj).e;
        return aljaVar == null ? alja.a : aljaVar;
    }

    public final alay h(int i) {
        return ackj.d(this.g.getString(i));
    }
}
