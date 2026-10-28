package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sdb extends scr implements rsq {
    public final Map a;
    private final awmd b;
    private abob e;
    private String f;

    public sdb(awmd awmdVar, rmp rmpVar, awmd awmdVar2) {
        super(awmdVar);
        this.f = "";
        this.a = new HashMap();
        this.b = awmdVar2;
        this.e = null;
    }

    private final boolean b(String str, smr smrVar, boolean z) {
        if (str == null || this.e != abob.a) {
            return false;
        }
        return (z && ((sbj) this.b.io()).e.contains(smrVar.a)) ? false : true;
    }

    @Override // defpackage.scr
    public final void a(aizs aizsVar, smr smrVar) throws sav {
        int i = aizsVar.e;
        aixr aixrVarA = aixr.a(i);
        if (aixrVarA == null) {
            aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
        }
        if (aixrVarA != aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID) {
            aixr aixrVarA2 = aixr.a(i);
            if (aixrVarA2 == null) {
                aixrVarA2 = aixr.TRIGGER_TYPE_UNSPECIFIED;
            }
            if (aixrVarA2 != aixr.TRIGGER_TYPE_ON_VIDEO_AD_START_PLAYING) {
                aixr aixrVarA3 = aixr.a(i);
                if (aixrVarA3 == null) {
                    aixrVarA3 = aixr.TRIGGER_TYPE_UNSPECIFIED;
                }
                if (aixrVarA3 != aixr.TRIGGER_TYPE_ON_PLAYBACK_WITH_CONTENT_VIDEO_ID) {
                    throw new sav("Invalid trigger type for v2 VideoStageEventTriggerAdapter.", 4);
                }
            }
        }
    }

    @Override // defpackage.scr
    protected final void ad(aizs aizsVar) {
        this.a.remove(aizsVar.d);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    @Override // defpackage.scr
    public final boolean ae(aizs aizsVar, smr smrVar, sgp sgpVar) {
        aixr aixrVarA = aixr.a(aizsVar.e);
        if (aixrVarA == null) {
            aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
        }
        if (this.e == null) {
            return false;
        }
        if (aixrVarA != aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID) {
            if (aixrVarA == aixr.TRIGGER_TYPE_ON_VIDEO_AD_START_PLAYING) {
            }
        }
        Map map = this.a;
        if (map.get(aizsVar.d) == null) {
            return aixrVarA == aixr.TRIGGER_TYPE_ON_VIDEO_AD_START_PLAYING ? false : false;
        }
        if (!b((String) map.get(aizsVar.d), smrVar, (aizsVar.b == 6 ? (aoip) aizsVar.c : aoip.a).b)) {
            if ((aixrVarA == aixr.TRIGGER_TYPE_ON_VIDEO_AD_START_PLAYING || this.e != abob.f || !TextUtils.equals(this.f, (CharSequence) this.a.get(aizsVar.d))) && (aixrVarA != aixr.TRIGGER_TYPE_ON_PLAYBACK_WITH_CONTENT_VIDEO_ID || !TextUtils.equals(this.f, (CharSequence) this.a.get(aizsVar.d)))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.rsq
    public final void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
        this.f = str;
        this.e = abobVar;
        ArrayList arrayList = new ArrayList();
        for (snl snlVar : this.d.at()) {
            aizs aizsVar = snlVar.b;
            aixr aixrVarA = aixr.a(aizsVar.e);
            if (aixrVarA == null) {
                aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
            }
            if (aixrVarA == aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID) {
                Map map = this.a;
                if (map.get(aizsVar.d) != null) {
                    if (b((String) map.get(aizsVar.d), snlVar.c, (aizsVar.b == 6 ? (aoip) aizsVar.c : aoip.a).b)) {
                        arrayList.add(aizsVar);
                    }
                }
            }
            aixr aixrVarA2 = aixr.a(aizsVar.e);
            if (aixrVarA2 == null) {
                aixrVarA2 = aixr.TRIGGER_TYPE_UNSPECIFIED;
            }
            if (aixrVarA2 == aixr.TRIGGER_TYPE_ON_VIDEO_AD_START_PLAYING && this.e == abob.f && TextUtils.equals(this.f, (CharSequence) this.a.get(aizsVar.d))) {
                arrayList.add(aizsVar);
            }
            aixr aixrVarA3 = aixr.a(aizsVar.e);
            if (aixrVarA3 == null) {
                aixrVarA3 = aixr.TRIGGER_TYPE_UNSPECIFIED;
            }
            if (aixrVarA3 == aixr.TRIGGER_TYPE_ON_PLAYBACK_WITH_CONTENT_VIDEO_ID && TextUtils.equals(this.f, (CharSequence) this.a.get(aizsVar.d))) {
                arrayList.add(aizsVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        t(arrayList);
    }

    @Override // defpackage.scr
    public final void v(int i, aizs aizsVar, smr smrVar, sgp sgpVar) {
        sda sdaVar = new sda(this, aizsVar, 0);
        Optional optional = sgpVar.c;
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = sdaVar.a;
            ((sdb) obj2).a.put(((aizs) sdaVar.b).d, obj);
        }
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void e(aaxa aaxaVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void h(aazs aazsVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
