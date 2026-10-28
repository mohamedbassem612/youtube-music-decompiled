package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.youtube.music.R;
import java.lang.ref.Reference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cbr implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ cbr(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v168, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v177, types: [java.lang.Object, oii] */
    @Override // defpackage.agfr
    public final Object io() {
        switch (this.$cid) {
            case 0:
                int i = cbt.a;
                return this.a;
            case 1:
                return ast.o((Context) this.a);
            case 2:
                int i2 = cbt.a;
                return this.a;
            case 3:
                int i3 = cbt.a;
                return this.a;
            case 4:
                int i4 = cbt.a;
                return this.a;
            case 5:
                int i5 = cbt.a;
                return this.a;
            case 6:
                return ((hau) this.a).a;
            case 7:
                aihf aihfVarCreateBuilder = anfw.a.createBuilder();
                alay alayVarC = ackj.c(((hyh) this.a).a.getString(R.string.audio_tracks_title));
                aihfVarCreateBuilder.copyOnWrite();
                anfw anfwVar = (anfw) aihfVarCreateBuilder.instance;
                alayVarC.getClass();
                anfwVar.c = alayVarC;
                anfwVar.b |= 1;
                aihh aihhVar = (aihh) alja.a.createBuilder();
                aliz alizVar = aliz.LANGUAGE;
                aihhVar.copyOnWrite();
                alja aljaVar = (alja) aihhVar.instance;
                aljaVar.c = alizVar.yN;
                aljaVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                anfw anfwVar2 = (anfw) aihfVarCreateBuilder.instance;
                alja aljaVar2 = (alja) aihhVar.build();
                aljaVar2.getClass();
                anfwVar2.d = aljaVar2;
                anfwVar2.b |= 2;
                aihh aihhVar2 = (aihh) ajwo.a.createBuilder();
                aihhVar2.e(ajhm.b, ajhm.a);
                aihfVarCreateBuilder.copyOnWrite();
                anfw anfwVar3 = (anfw) aihfVarCreateBuilder.instance;
                ajwo ajwoVar = (ajwo) aihhVar2.build();
                ajwoVar.getClass();
                anfwVar3.f = ajwoVar;
                anfwVar3.b |= 32;
                anfw anfwVar4 = (anfw) aihfVarCreateBuilder.build();
                aihf aihfVarCreateBuilder2 = anfv.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                anfv anfvVar = (anfv) aihfVarCreateBuilder2.instance;
                anfwVar4.getClass();
                anfvVar.c = anfwVar4;
                anfvVar.b = 66441108;
                return (anfv) aihfVarCreateBuilder2.build();
            case 8:
                aihf aihfVarCreateBuilder3 = anfw.a.createBuilder();
                alay alayVarC2 = ackj.c(((hyj) this.a).a.getString(R.string.dismiss_queue));
                aihfVarCreateBuilder3.copyOnWrite();
                anfw anfwVar5 = (anfw) aihfVarCreateBuilder3.instance;
                alayVarC2.getClass();
                anfwVar5.c = alayVarC2;
                anfwVar5.b |= 1;
                aihh aihhVar3 = (aihh) alja.a.createBuilder();
                aliz alizVar2 = aliz.DISMISS_QUEUE;
                aihhVar3.copyOnWrite();
                alja aljaVar3 = (alja) aihhVar3.instance;
                aljaVar3.c = alizVar2.yN;
                aljaVar3.b |= 1;
                aihfVarCreateBuilder3.copyOnWrite();
                anfw anfwVar6 = (anfw) aihfVarCreateBuilder3.instance;
                alja aljaVar4 = (alja) aihhVar3.build();
                aljaVar4.getClass();
                anfwVar6.d = aljaVar4;
                anfwVar6.b |= 2;
                aihh aihhVar4 = (aihh) ajwo.a.createBuilder();
                aihhVar4.e(akme.a, akmd.a);
                aihfVarCreateBuilder3.copyOnWrite();
                anfw anfwVar7 = (anfw) aihfVarCreateBuilder3.instance;
                ajwo ajwoVar2 = (ajwo) aihhVar4.build();
                ajwoVar2.getClass();
                anfwVar7.f = ajwoVar2;
                anfwVar7.b |= 32;
                anfw anfwVar8 = (anfw) aihfVarCreateBuilder3.build();
                aihf aihfVarCreateBuilder4 = anfv.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                anfv anfvVar2 = (anfv) aihfVarCreateBuilder4.instance;
                anfwVar8.getClass();
                anfvVar2.c = anfwVar8;
                anfvVar2.b = 66441108;
                return (anfv) aihfVarCreateBuilder4.build();
            case 9:
                aihf aihfVarCreateBuilder5 = anfw.a.createBuilder();
                aihh aihhVar5 = (aihh) alja.a.createBuilder();
                aliz alizVar3 = aliz.PLANNER_REVIEW;
                aihhVar5.copyOnWrite();
                alja aljaVar5 = (alja) aihhVar5.instance;
                aljaVar5.c = alizVar3.yN;
                aljaVar5.b |= 1;
                aihfVarCreateBuilder5.copyOnWrite();
                anfw anfwVar9 = (anfw) aihfVarCreateBuilder5.instance;
                alja aljaVar6 = (alja) aihhVar5.build();
                aljaVar6.getClass();
                anfwVar9.d = aljaVar6;
                anfwVar9.b |= 2;
                alay alayVarC3 = ackj.c(((hym) this.a).b.getResources().getString(R.string.setting_nerd_stats));
                aihfVarCreateBuilder5.copyOnWrite();
                anfw anfwVar10 = (anfw) aihfVarCreateBuilder5.instance;
                alayVarC3.getClass();
                anfwVar10.c = alayVarC3;
                anfwVar10.b |= 1;
                aihh aihhVar6 = (aihh) ajwo.a.createBuilder();
                aihhVar6.e(aoaz.b, aoaz.a);
                aihfVarCreateBuilder5.copyOnWrite();
                anfw anfwVar11 = (anfw) aihfVarCreateBuilder5.instance;
                ajwo ajwoVar3 = (ajwo) aihhVar6.build();
                ajwoVar3.getClass();
                anfwVar11.f = ajwoVar3;
                anfwVar11.b |= 32;
                anfw anfwVar12 = (anfw) aihfVarCreateBuilder5.build();
                aihf aihfVarCreateBuilder6 = anfv.a.createBuilder();
                aihfVarCreateBuilder6.copyOnWrite();
                anfv anfvVar3 = (anfv) aihfVarCreateBuilder6.instance;
                anfwVar12.getClass();
                anfvVar3.c = anfwVar12;
                anfvVar3.b = 66441108;
                return (anfv) aihfVarCreateBuilder6.build();
            case 10:
                hyp hypVar = (hyp) this.a;
                Activity activity = hypVar.a;
                adyj adyjVar = new adyj(activity, activity.getString(R.string.overflow_report));
                adyjVar.g(hypVar.c);
                aduk adukVar = new aduk(activity, R.drawable.yt_outline_flag_vd_theme_24);
                adukVar.d(R.color.quantum_grey600);
                adyjVar.f = adukVar.a();
                return adyjVar;
            case 11:
                aihf aihfVarCreateBuilder7 = anfw.a.createBuilder();
                alay alayVarC4 = ackj.c(((hyp) this.a).a.getString(R.string.overflow_report));
                aihfVarCreateBuilder7.copyOnWrite();
                anfw anfwVar13 = (anfw) aihfVarCreateBuilder7.instance;
                alayVarC4.getClass();
                anfwVar13.c = alayVarC4;
                anfwVar13.b |= 1;
                aihh aihhVar7 = (aihh) alja.a.createBuilder();
                aliz alizVar4 = aliz.FLAG;
                aihhVar7.copyOnWrite();
                alja aljaVar7 = (alja) aihhVar7.instance;
                aljaVar7.c = alizVar4.yN;
                aljaVar7.b |= 1;
                aihfVarCreateBuilder7.copyOnWrite();
                anfw anfwVar14 = (anfw) aihfVarCreateBuilder7.instance;
                alja aljaVar8 = (alja) aihhVar7.build();
                aljaVar8.getClass();
                anfwVar14.d = aljaVar8;
                anfwVar14.b |= 2;
                aihh aihhVar8 = (aihh) ajwo.a.createBuilder();
                aihhVar8.e(akzd.b, akzd.a);
                aihfVarCreateBuilder7.copyOnWrite();
                anfw anfwVar15 = (anfw) aihfVarCreateBuilder7.instance;
                ajwo ajwoVar4 = (ajwo) aihhVar8.build();
                ajwoVar4.getClass();
                anfwVar15.f = ajwoVar4;
                anfwVar15.b |= 32;
                anfw anfwVar16 = (anfw) aihfVarCreateBuilder7.build();
                aihf aihfVarCreateBuilder8 = anfv.a.createBuilder();
                aihfVarCreateBuilder8.copyOnWrite();
                anfv anfvVar4 = (anfv) aihfVarCreateBuilder8.instance;
                anfwVar16.getClass();
                anfvVar4.c = anfwVar16;
                anfvVar4.b = 66441108;
                return (anfv) aihfVarCreateBuilder8.build();
            case 12:
                aihf aihfVarCreateBuilder9 = anfw.a.createBuilder();
                alay alayVarC5 = ackj.c(((hyr) this.a).a.getString(R.string.subtitles));
                aihfVarCreateBuilder9.copyOnWrite();
                anfw anfwVar17 = (anfw) aihfVarCreateBuilder9.instance;
                alayVarC5.getClass();
                anfwVar17.c = alayVarC5;
                anfwVar17.b |= 1;
                aihh aihhVar9 = (aihh) alja.a.createBuilder();
                aliz alizVar5 = aliz.CAPTIONS;
                aihhVar9.copyOnWrite();
                alja aljaVar9 = (alja) aihhVar9.instance;
                aljaVar9.c = alizVar5.yN;
                aljaVar9.b |= 1;
                aihfVarCreateBuilder9.copyOnWrite();
                anfw anfwVar18 = (anfw) aihfVarCreateBuilder9.instance;
                alja aljaVar10 = (alja) aihhVar9.build();
                aljaVar10.getClass();
                anfwVar18.d = aljaVar10;
                anfwVar18.b |= 2;
                aihh aihhVar10 = (aihh) ajwo.a.createBuilder();
                aihhVar10.e(ajod.b, ajod.a);
                aihfVarCreateBuilder9.copyOnWrite();
                anfw anfwVar19 = (anfw) aihfVarCreateBuilder9.instance;
                ajwo ajwoVar5 = (ajwo) aihhVar10.build();
                ajwoVar5.getClass();
                anfwVar19.f = ajwoVar5;
                anfwVar19.b |= 32;
                anfw anfwVar20 = (anfw) aihfVarCreateBuilder9.build();
                aihf aihfVarCreateBuilder10 = anfv.a.createBuilder();
                aihfVarCreateBuilder10.copyOnWrite();
                anfv anfvVar5 = (anfv) aihfVarCreateBuilder10.instance;
                anfwVar20.getClass();
                anfvVar5.c = anfwVar20;
                anfvVar5.b = 66441108;
                return (anfv) aihfVarCreateBuilder10.build();
            case 13:
                aihf aihfVarCreateBuilder11 = anfw.a.createBuilder();
                alay alayVarC6 = ackj.c(((hyt) this.a).a.getString(R.string.quality_title));
                aihfVarCreateBuilder11.copyOnWrite();
                anfw anfwVar21 = (anfw) aihfVarCreateBuilder11.instance;
                alayVarC6.getClass();
                anfwVar21.c = alayVarC6;
                anfwVar21.b |= 1;
                aihh aihhVar11 = (aihh) alja.a.createBuilder();
                aliz alizVar6 = aliz.SETTINGS_MATERIAL;
                aihhVar11.copyOnWrite();
                alja aljaVar11 = (alja) aihhVar11.instance;
                aljaVar11.c = alizVar6.yN;
                aljaVar11.b |= 1;
                aihfVarCreateBuilder11.copyOnWrite();
                anfw anfwVar22 = (anfw) aihfVarCreateBuilder11.instance;
                alja aljaVar12 = (alja) aihhVar11.build();
                aljaVar12.getClass();
                anfwVar22.d = aljaVar12;
                anfwVar22.b |= 2;
                aihh aihhVar12 = (aihh) ajwo.a.createBuilder();
                aihhVar12.e(arfa.b, arfa.a);
                aihfVarCreateBuilder11.copyOnWrite();
                anfw anfwVar23 = (anfw) aihfVarCreateBuilder11.instance;
                ajwo ajwoVar6 = (ajwo) aihhVar12.build();
                ajwoVar6.getClass();
                anfwVar23.f = ajwoVar6;
                anfwVar23.b |= 32;
                anfw anfwVar24 = (anfw) aihfVarCreateBuilder11.build();
                aihf aihfVarCreateBuilder12 = anfv.a.createBuilder();
                aihfVarCreateBuilder12.copyOnWrite();
                anfv anfvVar6 = (anfv) aihfVarCreateBuilder12.instance;
                anfwVar24.getClass();
                anfvVar6.c = anfwVar24;
                anfvVar6.b = 66441108;
                return (anfv) aihfVarCreateBuilder12.build();
            case 14:
                return this.a.getString("flag_configuration", "{}");
            case 15:
                khn khnVar = lko.a;
                return new lmm((Context) this.a, (byte[]) null);
            case 16:
                return (nsl) ((Reference) this.a).get();
            case 17:
                oil oilVarF = this.a.f();
                return oilVarF == oil.UNDEFINED ? oil.SHARED_PREFERENCES_ONLY : oilVarF;
            case 18:
                return Boolean.valueOf(((omj) this.a).a() != oil.PROTOSTORE_ONLY);
            case 19:
                return qnl.aE((Context) this.a);
            default:
                qtf qtfVarF = ((qti) ((pwf) this.a).a).f("/client_streamz/gnp_android/gnp_job_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class), new qte("is_automotive", Boolean.class));
                qtfVarF.c();
                return qtfVarF;
        }
    }
}
