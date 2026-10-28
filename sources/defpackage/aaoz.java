package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aaoz implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aaoz(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object, xhy] */
    /* JADX WARN: Type inference failed for: r8v46, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v51, types: [awqg, java.lang.Object] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        int i;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                return ((iao) ((aapa) this.a).c.io()).b(((abpx) obj).a, true);
            case 1:
                return ((aapd) ((aapa) this.a).b.io()).a(((abpw) obj).a);
            case 2:
                abpx abpxVar = (abpx) obj;
                return ((aapa) this.a).e(abpxVar.a, abpxVar.b);
            case 3:
                aihf builder = ((atpt) obj).toBuilder();
                builder.copyOnWrite();
                atpt atptVar = (atpt) builder.instance;
                atptVar.c = ((atpr) this.a).e;
                atptVar.b |= 1;
                return (atpt) builder.build();
            case 4:
                aarj aarjVar = (aarj) this.a;
                agke agkeVar = (agke) obj;
                aaqf aaqfVar = (aaqf) aarjVar.d.io();
                aaqd aaqdVar = new aaqd(aaqfVar.b, aaqfVar.c.e(), ((vxz) aaqfVar.e).l(34, 45402343L, false));
                aaqdVar.m();
                aaqdVar.b = ((aaqg) aarjVar.c.io()).b.getLong(tym.y("last_offline_video_playback_position_sync_timestamp_%s", aarjVar.f.e().k()), 0L);
                int size = agkeVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    aaqdVar.a.add((areu) ((arer) agkeVar.get(i2)).a.build());
                }
                if (aarjVar.k.l(181, 45710463L, false)) {
                    aaqdVar.c = aarjVar.h.a();
                }
                return aaqdVar;
            case 5:
                ajwo ajwoVar = (ajwo) obj;
                if (ajwoVar != null) {
                    return this.a.f(ajwoVar);
                }
                return null;
            case 6:
                return Boolean.valueOf(((abix) this.a).a);
            case 7:
                abpx abpxVar2 = (abpx) obj;
                return ((aboq) this.a).e.n(abpxVar2.a, abpxVar2.b);
            case 8:
                abpx abpxVar3 = (abpx) obj;
                return ((aboq) this.a).e.n(abpxVar3.a, abpxVar3.b);
            case 9:
                abpw abpwVar = (abpw) obj;
                return ((aboq) this.a).a.i(abpwVar.a, abpwVar.c, -1, null, null, abpwVar.d, abpwVar.b);
            case 10:
                abpx abpxVar4 = (abpx) obj;
                return ((aboq) this.a).e(abpxVar4.a, abpxVar4.b);
            case 11:
                abpx abpxVar5 = (abpx) obj;
                return ((aboq) this.a).e.n(abpxVar5.a, abpxVar5.b);
            case 12:
                aihf builder2 = ((atpv) obj).toBuilder();
                builder2.cQ((String) this.a, true);
                return (atpv) builder2.build();
            case 13:
                abnl abnlVar = (abnl) obj;
                ?? r8 = ((abvk) this.a).o.d;
                if (r8 != 0 && r8.as(abob.c) && !r8.ar(abob.j) && TextUtils.equals(abnlVar.w(), r8.q())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                ((abvx) this.a).e();
                return null;
            case 15:
                return this.a.invoke(obj);
            case 16:
                return ((abww) this.a).f();
            case 17:
                return Boolean.valueOf(((abww) this.a).m());
            case 18:
                return Boolean.valueOf(((abww) this.a).n());
            case 19:
                acuy acuyVar = (acuy) obj;
                acpc acpcVar = (acpc) this.a;
                String str = acpcVar.f;
                acuz acuzVar = acuz.a;
                str.getClass();
                acuz acuzVar2 = (acuz) acuyVar.b.get(str);
                if (acuzVar2 != null) {
                    acuzVar = acuzVar2;
                }
                aihf builder3 = acuzVar.toBuilder();
                int i3 = acpcVar.e;
                builder3.copyOnWrite();
                ((acuz) builder3.instance).c = i3;
                String str2 = acpcVar.b;
                builder3.copyOnWrite();
                acuz acuzVar3 = (acuz) builder3.instance;
                str2.getClass();
                acuzVar3.e = str2;
                if (acpcVar.c) {
                    builder3.copyOnWrite();
                    ((acuz) builder3.instance).b = true;
                }
                acuz acuzVar4 = (acuz) builder3.build();
                aihf builder4 = acuyVar.toBuilder();
                builder4.ag(acpcVar.f);
                builder4.af(acpcVar.f, acuzVar4);
                return (acuy) builder4.build();
            default:
                acpc acpcVar2 = (acpc) this.a;
                apfi apfiVar = acpcVar2.g;
                int i4 = apfiVar.b;
                if ((i4 & 2) == 0) {
                    if ((i4 & 1) != 0) {
                    }
                    return amef.REEL_PERSISTENT_EDU_STATE_TEMPORARILY_DISABLED;
                }
                if (apfiVar.d > 0 && acpcVar2.c) {
                    return amef.REEL_PERSISTENT_EDU_STATE_PERMANENTLY_DISABLED;
                }
                if ((i4 & 1) == 0 || ((i = apfiVar.c) != 0 && (i <= 0 || acpcVar2.d < i))) {
                    return amef.REEL_PERSISTENT_EDU_STATE_ENABLED;
                }
                return amef.REEL_PERSISTENT_EDU_STATE_TEMPORARILY_DISABLED;
        }
    }
}
