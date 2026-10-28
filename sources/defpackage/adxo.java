package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adxo implements adxu {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public adxo(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [adxt, java.lang.Object] */
    @Override // defpackage.adxu
    public final void a() {
        RecyclerView recyclerView;
        nh nhVar;
        int iA;
        int iA2;
        int i = this.$cid;
        if (i == 0) {
            aihf aihfVarCreateBuilder = asii.a.createBuilder();
            aihf aihfVarCreateBuilder2 = atxp.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            ((atxp) aihfVarCreateBuilder2.instance).b = 0;
            atxp atxpVar = (atxp) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            asii asiiVar = (asii) aihfVarCreateBuilder.instance;
            atxpVar.getClass();
            asiiVar.c = atxpVar;
            asiiVar.b |= 1;
            ((aqi) this.a).b((asii) aihfVarCreateBuilder.build());
            return;
        }
        if (i != 1) {
            aihf aihfVarCreateBuilder3 = atxp.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            ((atxp) aihfVarCreateBuilder3.instance).b = 0;
            this.a.a((atxp) aihfVarCreateBuilder3.build());
            return;
        }
        jml jmlVar = (jml) this.a;
        if (jmlVar.k) {
            jmlVar.k = false;
            if (jmlVar.m.m(270, 45835641L) && (recyclerView = jmlVar.e) != null && (nhVar = recyclerView.m) != null && (iA2 = (iA = nhVar.a()) - jmlVar.l) > 0) {
                recyclerView.aj(iA2 - 1);
                jmlVar.l = iA;
            }
            jmlVar.e();
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [adxt, java.lang.Object] */
    @Override // defpackage.adxu
    public final void b(atxp atxpVar) {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                this.a.a(atxpVar);
                return;
            }
            ((agrc) ((agrc) ((agrc) jml.a.b()).j(new RuntimeException(atxpVar.c))).k("com/google/android/apps/youtube/music/voice/views/VoiceSearchSectionListController$2", "onError", 420, "VoiceSearchSectionListController.java")).y("VoiceSearchFragment section list mutation operations error: Code: %s, %s", atxpVar.b, atxpVar.c);
            jml jmlVar = (jml) this.a;
            jmlVar.k = false;
            jmlVar.e();
            return;
        }
        aihf aihfVarCreateBuilder = asii.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asii asiiVar = (asii) aihfVarCreateBuilder.instance;
        atxpVar.getClass();
        asiiVar.c = atxpVar;
        asiiVar.b |= 1;
        ((aqi) this.a).b((asii) aihfVarCreateBuilder.build());
    }
}
