package defpackage;

import android.view.ViewGroup;
import com.google.android.libraries.youtube.reel.internal.pager.ReelRecyclerView;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acqh extends nh implements tef {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/reel/internal/pager/ReelPageAdapter");
    private final aciz A;
    public final Object e = new Object();
    public List f = new ArrayList();
    public final acqz g;
    public final abuv h;
    public final acts i;
    public final boolean j;
    public final mbc k;
    public final tqj l;
    public final tes m;
    public final hno n;
    public final adif o;
    public final qcb p;
    private final Map q;
    private final awmd r;
    private final acpo s;
    private final boolean t;
    private final boolean u;
    private boolean v;
    private final vxz w;
    private final vxz x;
    private final aehs y;
    private final aciz z;

    public acqh(aehs aehsVar, aciz acizVar, aciz acizVar2, vxz vxzVar, vxz vxzVar2, Map map, abuv abuvVar, hno hnoVar, acts actsVar, mbc mbcVar, tqj tqjVar, awmd awmdVar, awmd awmdVar2, acpo acpoVar, adif adifVar, qcb qcbVar, acqz acqzVar, boolean z) {
        this.y = aehsVar;
        this.z = acizVar;
        this.A = acizVar2;
        this.o = adifVar;
        this.w = vxzVar;
        this.x = vxzVar2;
        this.q = map;
        this.h = abuvVar;
        this.n = hnoVar;
        this.i = actsVar;
        this.g = acqzVar;
        this.k = mbcVar;
        this.l = tqjVar;
        this.j = z;
        this.r = awmdVar2;
        this.s = acpoVar;
        this.p = qcbVar;
        this.v = z;
        int i = tqr.a;
        this.t = tqjVar.k(1073829947);
        this.u = tqjVar.k(1073830488);
        if (tym.at(tqjVar)) {
            tes tesVar = (tes) awmdVar.io();
            this.m = tesVar;
            tesVar.h(this, tew.d, tew.e, tew.c);
        } else {
            this.m = null;
        }
        t(true);
    }

    private static int Z(int i, int i2) {
        if (i == -1 || i <= i2) {
            return 0;
        }
        return i - i2;
    }

    private final int aa() {
        hno hnoVar = this.n;
        if (hnoVar.f() > 0) {
            return hnoVar.f();
        }
        vxz vxzVar = this.w;
        if (vxzVar.c(2, 45383381L, 0L) > 0) {
            return (int) vxzVar.c(2, 45383381L, 0L);
        }
        return 40;
    }

    private final boolean ab() {
        return this.w.m(25, 45383267L);
    }

    private final boolean ac() {
        return this.w.m(26, 45383268L);
    }

    public final int A(long j) {
        synchronized (this.e) {
            if (((vxz) this.n.j).l(35, 45646173L, false)) {
                int iBinarySearch = Collections.binarySearch(aguu.u(this.f, new abzr(12)), Long.valueOf(j));
                return iBinarySearch >= 0 ? iBinarySearch : -1;
            }
            for (int i = 0; i < this.f.size(); i++) {
                if (((acra) this.f.get(i)).b == j) {
                    return i;
                }
            }
            return -1;
        }
    }

    public final int B() {
        synchronized (this.e) {
            return this.f.isEmpty() ? -1 : 0;
        }
    }

    public final int C() {
        int size;
        synchronized (this.e) {
            size = -1;
            if (!this.f.isEmpty()) {
                size = (-1) + this.f.size();
            }
        }
        return size;
    }

    public final int D() {
        int size;
        synchronized (this.e) {
            size = this.f.size();
        }
        return size;
    }

    public final long E(int i) {
        acra acraVarL = L(i);
        if (acraVarL == null) {
            return Long.MIN_VALUE;
        }
        return acraVarL.b;
    }

    public final long F(ajwo ajwoVar, List list, int i, long j, long j2) {
        ajwo ajwoVarP = P(ajwoVar);
        aigj aigjVar = list != null ? (aigj) ((Optional) list.get(i)).orElse(null) : null;
        qcb qcbVar = this.p;
        long j3 = j2 + 1;
        acra acraVarX = qcbVar.x(0L, j3, ajwoVarP, aigjVar, j, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(acraVarX);
        acra acraVarX2 = qcbVar.x(j3, j3, P(ajwoVar), null, 0L, this.g.ak);
        acraVarX2.o.addAll(arrayList);
        this.f.add(acraVarX2);
        return j3;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    public final long G(ajwo ajwoVar, List list, int i, long j, long j2) {
        long j3;
        long j4;
        long j5;
        boolean z = this.g.ak;
        long j6 = j2 + 1;
        if (z) {
            j3 = j6;
            j4 = j3;
        } else {
            j3 = Long.MIN_VALUE;
            j4 = j6;
        }
        acra acraVarX = this.p.x(j4, j3, P(ajwoVar), list != null ? (aigj) ((Optional) list.get(i)).orElse(null) : null, j, z);
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            if ((((apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c & 2097152) != 0) {
                j5 = j2 + 2;
                acraVarX.j = j5;
            } else {
                j5 = j4;
            }
        } else {
            j5 = j4;
        }
        this.f.add(acraVarX);
        return j5;
    }

    public final acra H(int i, String str, Function function) {
        if (str.isEmpty()) {
            return null;
        }
        hno hnoVar = this.n;
        int iH = hnoVar.h() > 0 ? hnoVar.h() : 5;
        Object obj = this.e;
        synchronized (obj) {
            int iMin = Math.min(this.f.size(), i + (hnoVar.g() > 0 ? hnoVar.g() : 5));
            for (int iMax = Math.max(0, i - iH); iMax < iMin; iMax++) {
                acra acraVar = (acra) this.f.get(iMax);
                if (acraVar.c() != null && str.equals(function.apply(acraVar))) {
                    return acraVar;
                }
                for (acra acraVar2 : acraVar.o) {
                    if (acraVar2.c() != null && str.equals(function.apply(acraVar2))) {
                        return acraVar2;
                    }
                }
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0080 A[Catch: all -> 0x0085, TryCatch #0 {, blocks: (B:6:0x0006, B:9:0x0012, B:11:0x0020, B:14:0x0027, B:16:0x002d, B:18:0x0030, B:22:0x003d, B:25:0x0041, B:27:0x004f, B:30:0x0056, B:32:0x005c, B:34:0x005e, B:36:0x0062, B:38:0x0070, B:41:0x0077, B:43:0x007d, B:46:0x0080), top: B:51:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0039 A[SYNTHETIC] */
    public final acra I(ajwo ajwoVar, int i) {
        int i2;
        acra acraVar;
        acra acraVarA;
        acra acraVarA2;
        acra acraVarA3;
        if (ajwoVar == null) {
            return null;
        }
        synchronized (this.e) {
            int size = this.f.size();
            int i3 = size - 1;
            if (i < 0 || i >= size) {
                i2 = size;
            } else {
                acra acraVar2 = (acra) this.f.get(i);
                if (acraVar2.l() && (acraVarA3 = acraVar2.a()) != null) {
                    acraVar2 = acraVarA3;
                }
                if (W(acraVar2, ajwoVar)) {
                    return acraVar2;
                }
                i3 = i - 1;
                i2 = i + 1;
            }
            while (true) {
                if (i3 < 0 && i2 >= size) {
                    return null;
                }
                if (i2 < size) {
                    acraVar = (acra) this.f.get(i2);
                    if (acraVar.l() && (acraVarA2 = acraVar.a()) != null) {
                        acraVar = acraVarA2;
                    }
                    if (W(acraVar, ajwoVar)) {
                        break;
                    }
                    i2++;
                    if (i3 >= 0) {
                        acraVar = (acra) this.f.get(i3);
                        if (acraVar.l() && (acraVarA = acraVar.a()) != null) {
                            acraVar = acraVarA;
                        }
                        if (W(acraVar, ajwoVar)) {
                            break;
                        }
                        i3--;
                    }
                } else if (i3 >= 0) {
                    acraVar = (acra) this.f.get(i3);
                    if (acraVar.l()) {
                        acraVar = acraVarA;
                    }
                    if (W(acraVar, ajwoVar)) {
                        break;
                    }
                    i3--;
                }
            }
            return acraVar;
        }
    }

    public final acra J(long j) {
        return L(A(j));
    }

    public final acra K(int i, String str) {
        return H(i, str, new accu(4));
    }

    public final acra L(int i) {
        acra acraVar;
        synchronized (this.e) {
            acraVar = null;
            if (i >= 0) {
                if (i < this.f.size()) {
                    acraVar = (acra) this.f.get(i);
                }
            }
        }
        return acraVar;
    }

    public final agke M(final long j, final abnl abnlVar) {
        agke agkeVar;
        synchronized (this.e) {
            agkeVar = (agke) Collection.EL.stream(this.f).map(new Function() { // from class: acqg
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public final /* synthetic */ Function mo840andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                /* JADX WARN: Code duplicated, block: B:169:0x02ad  */
                /* JADX WARN: Code duplicated, block: B:40:0x009a  */
                /* JADX WARN: Code duplicated, block: B:60:0x00f7  */
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    boolean z;
                    abnl abnlVarA;
                    apfp apfpVar;
                    String str;
                    String str2;
                    boolean z2;
                    acut acutVar;
                    acra acraVarA;
                    acra acraVar = (acra) obj;
                    boolean zAs = aecm.as(acraVar.f);
                    acqh acqhVar = this.a;
                    if (zAs && !acqhVar.n.aJ()) {
                        return acqhVar.h;
                    }
                    long j2 = acraVar.b;
                    if (acraVar.l() && acqhVar.n.aP() && (acraVarA = acraVar.a()) != null) {
                        acraVar = acraVarA;
                    }
                    if (j2 != j || (abnlVarA = abnlVar) == null) {
                        z = false;
                        abnlVarA = null;
                    } else {
                        z = true;
                    }
                    acut acutVar2 = !z ? acraVar.g : null;
                    if (acutVar2 == null) {
                        ajwo ajwoVarT = acraVar.f;
                        abuv abuvVar = acqhVar.h;
                        hno hnoVar = acqhVar.n;
                        ajwoVarT.getClass();
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(apef.b);
                        ajwoVarT.c(aihlVarCheckIsLite);
                        if (ajwoVarT.j.n(aihlVarCheckIsLite.d)) {
                            acutVar = new acut(abuvVar, null);
                        } else if (aawr.w(ajwoVarT)) {
                            acutVar = new acut(new acup(ajwoVarT), null);
                        } else {
                            apfp apfpVarAa = aecm.aa(ajwoVarT);
                            if (apfpVarAa == null) {
                                acutVar = new acut(null, null);
                            } else {
                                if (hnoVar.aE()) {
                                    String str3 = apfpVarAa.q;
                                    int i = actk.b;
                                    if (aasc.c(str3)) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                } else {
                                    z2 = false;
                                }
                                if (hnoVar.aj()) {
                                    ajwoVarT = aecm.T(ajwoVarT);
                                    ajwoVarT.getClass();
                                }
                                if (abnlVarA == null) {
                                    abnk abnkVar = new abnk();
                                    abnkVar.a = ajwoVarT;
                                    abnkVar.c(z2);
                                    abnlVarA = abnkVar.a();
                                }
                                try {
                                    abut abutVarH = abuu.h();
                                    abutVarH.b(abnlVarA);
                                    abutVarH.e(!aecm.ai(abnlVarA.b));
                                    if (hnoVar.bh()) {
                                        apfp apfpVarAa2 = aecm.aa(abnlVarA.b);
                                        String str4 = apfpVarAa2 != null ? apfpVarAa2.U : null;
                                        if (str4 != null && str4.length() != 0) {
                                            abutVarH.a = str4;
                                        }
                                    }
                                    acutVar2 = new acut(abutVarH.a(), abnlVarA);
                                } catch (IllegalArgumentException unused) {
                                    acutVar2 = new acut(null, abnlVarA);
                                }
                            }
                            if (!z) {
                                acraVar.g = acutVar2;
                            }
                        }
                        acutVar2 = acutVar;
                        if (!z) {
                            acraVar.g = acutVar2;
                        }
                    }
                    abun abunVar = acutVar2.a;
                    if (abunVar != null) {
                        return abunVar;
                    }
                    ajwo ajwoVar = acraVar.f;
                    abnl abnlVar2 = acutVar2.b;
                    if (ajwoVar != null) {
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                        ajwoVar.c(aihlVarCheckIsLite2);
                        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                        apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    } else {
                        apfpVar = apfp.a;
                    }
                    String strW = abnlVar2 != null ? abnlVar2.w() : "";
                    acqhVar.i.f(28, a.cf(j2, "ReelPageAdapter generated invalid VideoPlaybackItem at reelPagePosition ", ". PlaybackStartDescriptor command is null?%b, PSD video id is empty?%s, RWE video id is empty?%b, input_type=%s, source=%s"));
                    agrc agrcVar = (agrc) ((agrc) acqh.a.b()).k("com/google/android/libraries/youtube/reel/internal/pager/ReelPageAdapter", "logInvalidItem", 2234, "ReelPageAdapter.java");
                    Long lValueOf = Long.valueOf(j2);
                    Boolean boolValueOf = Boolean.valueOf(ajwoVar == null);
                    Boolean boolValueOf2 = Boolean.valueOf(apfpVar.o.isEmpty());
                    int iAV = a.aV(apfpVar.n);
                    if (iAV == 0 || iAV == 1) {
                        str = "REEL_WATCH_INPUT_TYPE_UNKNOWN";
                    } else if (iAV != 2) {
                        str = iAV != 3 ? "REEL_WATCH_INPUT_TYPE_SEEDLESS_SEQUENCE" : "REEL_WATCH_INPUT_TYPE_SEEDLESS";
                    } else {
                        str = "REEL_WATCH_INPUT_TYPE_DEFAULT";
                    }
                    String str5 = str;
                    int iH = atqp.H(apfpVar.L);
                    if (iH != 0) {
                        switch (iH) {
                            case 1:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_UNKNOWN";
                                break;
                            case 2:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_CREATOR_NOTIFICATION_VIEWS";
                                break;
                            case 3:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_CREATOR_NOTIFICATION_SUBS";
                                break;
                            case 4:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_CREATOR_NOTIFICATION_CHANNEL_MENTION";
                                break;
                            case 5:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_REELS_TAB";
                                break;
                            case 6:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_HOME";
                                break;
                            case 7:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_WATCH_NEXT";
                                break;
                            case 8:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SUBSCRIPTIONS";
                                break;
                            case 9:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_REEL_ITEM_WATCH";
                                break;
                            case 10:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_REEL_WATCH_SEQUENCE";
                                break;
                            case 11:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_CHANNEL_HOME_AVATAR";
                                break;
                            case 12:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_WATCH_NEXT_AVATAR";
                                break;
                            case 13:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_RESOLVE_URL_HANDLER";
                                break;
                            case 14:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SFV_PIVOT";
                                break;
                            case 15:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_HOME_CHIP";
                                break;
                            case 16:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_PIVOT_BAR";
                                break;
                            case 17:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_TOP_BAR_BUTTON";
                                break;
                            case 18:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_CHANNEL_SHELF";
                                break;
                            case 19:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_NOTIFICATION";
                                break;
                            case 20:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_YOUR_VIDEOS";
                                break;
                            case 21:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SEARCH";
                                break;
                            case 22:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_HASHTAG_LANDING_PAGE";
                                break;
                            case 23:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_EXPLORE";
                                break;
                            case 24:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_PROMO";
                                break;
                            case 25:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_ANALYTICS_TOP_REMIX_SHELF";
                                break;
                            case 26:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_HOME_FEED_AVATAR";
                                break;
                            case 27:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_WATCH_NEXT_FEED_AVATAR";
                                break;
                            case 28:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_PIVOT_BAR_RESUME_TO_SHORTS";
                                break;
                            case 29:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_TRENDS_BADGE_ON_VOD_WATCH";
                                break;
                            case 30:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_HISTORY";
                                break;
                            case 31:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_WATCH_NEXT_REMIX";
                                break;
                            case 32:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_STRUCTURED_DESCRIPTION_REMIX";
                                break;
                            case 33:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_PAUSED_STATE_SUBSCRIPTIONS";
                                break;
                            case 34:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SUBSCRIPTIONS_FEED_AVATAR";
                                break;
                            case 35:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_AUDIENCE_OTHER_CONTENT";
                                break;
                            case 36:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_MULTIMIX_PLAYER_ATTRIBUTION_LABEL";
                                break;
                            case 37:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_GAMING_SHORTS_SHELF";
                                break;
                            case 38:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_GAME_SHORTS_PIVOT_PAGE";
                                break;
                            case 39:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_HOME_SINGLETON";
                                break;
                            case 40:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_PLAYLIST";
                                break;
                            case 41:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_ANALYTICS_SUMMARY";
                                break;
                            case 42:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_WATCH_SINGLETON";
                                break;
                            case 43:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_WATCH_NEXT_COMMENTS";
                                break;
                            case 44:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_COMMENTS";
                                break;
                            case 45:
                            case 58:
                            default:
                                str2 = "null";
                                break;
                            case 46:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_WATCH_NEXT_FAMILY_TARGETED_SHORTS";
                                break;
                            case 47:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_HOME_FAMILY_TARGETED_SHORTS";
                                break;
                            case 48:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_LIVE_AVATAR_RING";
                                break;
                            case 49:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_PIVOT_BAR_SHORTS_TARGETED";
                                break;
                            case 50:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_LIVE_CHANNEL_PAGE";
                                break;
                            case 51:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_CHANNEL_PAGE_VIDEOS_TAB";
                                break;
                            case 52:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_CHANNEL_PAGE_SHORTS_TAB";
                                break;
                            case 53:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_LIVE_NOTIFICATION";
                                break;
                            case 54:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_LIBRARY_SINGLETON";
                                break;
                            case 55:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_CONTEXTUAL_SEARCH";
                                break;
                            case 56:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_TRENDING";
                                break;
                            case 57:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHOPPING_DESTINATION_SHORTS_SHELF";
                                break;
                            case 59:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_LINK_COMMAND";
                                break;
                            case 60:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_TRENDING_SHORTS_TRENDS";
                                break;
                            case 61:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_HOME_TRENDING_HASHTAG";
                                break;
                            case 62:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_PAUSED_STATE_IMMERSIVE_LIVE";
                                break;
                            case 63:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_IMMERSIVE_LIVE_PREVIEW";
                                break;
                            case 64:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_ON_POSTS";
                                break;
                            case 65:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_PAUSED_STATE_SHOPPING";
                                break;
                            case 66:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_MAX_VIDEO_LENGTH_FILTER_CHIP";
                                break;
                            case 67:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_LIVE_CREATION_COOLOFF";
                                break;
                            case 68:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_REDIRECT_CLASSIC_LIVE_AUTOPLAY";
                                break;
                            case 69:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_REDIRECT_CLASSIC_LIVE_HEARTBEAT";
                                break;
                            case 70:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_REDIRECT_IMMERSIVE_LIVE_ENDSCREEN";
                                break;
                            case 71:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_PLACE_SHORTS_PIVOT_PAGE";
                                break;
                            case 72:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SEARCH_FAMILY_TARGETED_SHORTS";
                                break;
                            case 73:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_RELATED_VIDEOS_CHIP";
                                break;
                            case 74:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_COMMENT_STICKER";
                                break;
                            case 75:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_PIVOT_BAR_START_TO_MIXED_FEED";
                                break;
                            case 76:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_ZERO_PREFIX_SEARCH";
                                break;
                            case 77:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_MEDIA_HUB";
                                break;
                            case 78:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_SHORTS_MINI_BROWSE";
                                break;
                            case 79:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_PROJECT_SANDBOX_PIVOT_BAR";
                                break;
                            case 80:
                                str2 = "REEL_WATCH_ENDPOINT_SOURCE_PROJECT_SANDBOX_CHAT";
                                break;
                        }
                    } else {
                        str2 = "REEL_WATCH_ENDPOINT_SOURCE_UNKNOWN";
                    }
                    agrcVar.H("ReelPageAdapter generated invalid VideoPlaybackItem at reelPagePosition %d. PlaybackStartDescriptor command is null?%b, PSD video id is empty?%s, RWE video id is empty?%b, input_type=%s, source=%s", lValueOf, boolValueOf, strW, boolValueOf2, str5, str2);
                    return acqhVar.h;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(aghu.a);
        }
        return agkeVar;
    }

    public final agkz N() {
        HashSet hashSet = new HashSet();
        S(new aasz(hashSet, 14));
        return agkz.n(hashSet);
    }

    public final ajwo O(long j) {
        acra acraVarJ = J(j + 1);
        if (acraVarJ != null) {
            return acraVarJ.f;
        }
        return null;
    }

    public final ajwo P(ajwo ajwoVar) {
        return this.n.ak() ? aecm.U(ajwoVar) : ajwoVar;
    }

    public final apgj Q(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajwo ajwoVar = (ajwo) it.next();
            if (aecm.aD(ajwoVar)) {
                hashSet.add(aecm.ad(ajwoVar));
            }
        }
        hashSet.retainAll(N());
        if (hashSet.isEmpty()) {
            return null;
        }
        agke agkeVarI = aawo.i(list);
        aihf aihfVarCreateBuilder = apgj.a.createBuilder();
        aihf aihfVarCreateBuilder2 = apgh.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        apgh apghVar = (apgh) aihfVarCreateBuilder2.instance;
        aiie aiieVar = apghVar.b;
        if (!aiieVar.c()) {
            apghVar.b = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(agkeVarI, apghVar.b);
        aihfVarCreateBuilder.copyOnWrite();
        apgj apgjVar = (apgj) aihfVarCreateBuilder.instance;
        apgh apghVar2 = (apgh) aihfVarCreateBuilder2.build();
        apghVar2.getClass();
        apgjVar.c = apghVar2;
        apgjVar.b = 1;
        return (apgj) aihfVarCreateBuilder.build();
    }

    public final List R(List list) {
        hno hnoVar = this.n;
        if (!hnoVar.ak() || !this.t) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajwo ajwoVar = (ajwo) it.next();
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                acul aculVar = (acul) this.r.io();
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                amdd amddVarN = acfz.N(aculVar, (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)), this.s.hx(), hnoVar.A());
                aihh aihhVar = (aihh) ajwp.a.createBuilder();
                aihhVar.e(amdx.b, amddVarN);
                ajwp ajwpVar = (ajwp) aihhVar.build();
                aihh aihhVar2 = (aihh) ajwoVar.toBuilder();
                aihhVar2.copyOnWrite();
                ajwo ajwoVar2 = (ajwo) aihhVar2.instance;
                ajwpVar.getClass();
                ajwoVar2.e = ajwpVar;
                ajwoVar2.b |= 2;
                ajwoVar = (ajwo) aihhVar2.build();
            }
            arrayList.add(ajwoVar);
        }
        return arrayList;
    }

    public final void S(twi twiVar) {
        synchronized (this.e) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                twiVar.a((acra) it.next());
            }
        }
    }

    public final void T(boolean z) {
        int size;
        if (!this.j || this.v == z) {
            return;
        }
        this.v = z;
        synchronized (this.e) {
            size = this.f.size();
        }
        if (z) {
            h(size);
        } else {
            n(size);
        }
    }

    public final void U() {
        int size;
        List list;
        int size2;
        if (!ab() && !ac()) {
            hno hnoVar = this.n;
            if (!hnoVar.s() && !hnoVar.t()) {
                return;
            }
        }
        acqz acqzVar = this.g;
        if (acqzVar.L()) {
            return;
        }
        hno hnoVar2 = this.n;
        if (hnoVar2.s() || hnoVar2.t()) {
            int i = acqzVar.Q;
            if (hnoVar2.t()) {
                if (Z(i, 10) > 0) {
                    this.o.d(aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_REEL_IP_PRUNING_V3_SWIPE_BACK10);
                }
                if (Z(i, 20) > 0) {
                    this.o.d(aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_REEL_IP_PRUNING_V3_SWIPE_BACK20);
                }
            }
            if (hnoVar2.s()) {
                ArrayList arrayList = new ArrayList();
                int iZ = Z(i, (int) ((vxz) hnoVar2.m).c(4, 45826267L, 0L));
                synchronized (this.e) {
                    if (iZ > 0) {
                        iZ = Math.min(iZ, this.f.size());
                        arrayList.addAll(this.f.subList(0, iZ));
                        this.f.subList(0, iZ).clear();
                    }
                }
                if (iZ > 0) {
                    m(0, iZ);
                }
                if (!arrayList.isEmpty()) {
                    this.g.w(arrayList);
                    if (this.u) {
                        int size3 = arrayList.size();
                        for (int i2 = 0; i2 < size3; i2++) {
                            ((acra) arrayList.get(i2)).g();
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size4 = arrayList.size();
                    for (int i3 = 0; i3 < size4; i3++) {
                        arrayList2.add(((acra) arrayList.get(i3)).f);
                    }
                    aciz acizVarJ = this.o.j();
                    acizVarJ.k(14);
                    acizVarJ.j(adif.g(aawo.i(arrayList2)));
                    acizVarJ.g();
                }
            }
            if (this.n.s()) {
                return;
            }
        }
        if (ab() || this.n.R()) {
            ArrayList arrayList3 = new ArrayList();
            synchronized (this.e) {
                if (this.f.size() > aa()) {
                    size = this.f.size() - (aa() - 10);
                    if (size > 0) {
                        size = Math.min(size, this.f.size());
                        arrayList3.addAll(this.f.subList(0, size));
                        this.f.subList(0, size).clear();
                    }
                } else {
                    size = 0;
                }
            }
            if (size > 0) {
                m(0, size);
            }
            if (!arrayList3.isEmpty()) {
                this.g.w(arrayList3);
                if (this.u) {
                    int size5 = arrayList3.size();
                    for (int i4 = 0; i4 < size5; i4++) {
                        ((acra) arrayList3.get(i4)).g();
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                int size6 = arrayList3.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    arrayList4.add(((acra) arrayList3.get(i5)).f);
                }
                aciz acizVarJ2 = this.o.j();
                acizVarJ2.k(14);
                acizVarJ2.j(adif.g(aawo.i(arrayList4)));
                acizVarJ2.g();
            }
        }
        if (ac()) {
            synchronized (this.e) {
                int i6 = 0;
                while (true) {
                    int size7 = this.f.size() - aa();
                    list = this.f;
                    if (i6 >= size7) {
                        break;
                    }
                    acra acraVar = (acra) list.get(i6);
                    if (acraVar != null) {
                        acraVar.g();
                    }
                    i6++;
                }
                size2 = list.size() - aa();
            }
            if (size2 > 0) {
                j(0, size2);
            }
        }
    }

    public final void V() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this.e) {
            int i2 = this.g.Q;
            if (i2 == -1) {
                return;
            }
            if (!this.n.s() || i2 <= 1 || (i = i2 - 1) >= this.f.size()) {
                i = 0;
            } else {
                arrayList.addAll(this.f.subList(0, i));
                this.f.subList(0, i).clear();
            }
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                acra acraVar = (acra) this.f.get(i3);
                if (Math.abs(i3 - (i2 - i)) > 1 && acraVar.i == null) {
                    acraVar.f();
                    if (acraVar.g != null) {
                        acraVar.g = null;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                m(0, arrayList.size());
                this.g.w(arrayList);
                if (this.u) {
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((acra) arrayList.get(i4)).g();
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    arrayList2.add(((acra) arrayList.get(i5)).f);
                }
                aciz acizVarJ = this.o.j();
                acizVarJ.k(14);
                acizVarJ.j(adif.g(aawo.i(arrayList2)));
                acizVarJ.g();
            }
            this.g.o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    public final boolean W(acra acraVar, ajwo ajwoVar) {
        ajwo ajwoVar2;
        if (ajwoVar == null || acraVar == null || (ajwoVar2 = acraVar.f) == null) {
            return false;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar2.c(aihlVarCheckIsLite);
        if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                ajwo ajwoVar3 = acraVar.f;
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
                ajwoVar3.c(aihlVarCheckIsLite3);
                Object objK = ajwoVar3.j.k(aihlVarCheckIsLite3.d);
                apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK));
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite4);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                apfp apfpVar2 = (apfp) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                if (this.n.T()) {
                    boolean zJ = acraVar.j();
                    if (zJ != aawr.w(ajwoVar)) {
                        return false;
                    }
                    if (!zJ) {
                        return apfpVar.o.equals(apfpVar2.o) ? false : false;
                    }
                    if (!apfpVar.o.equals(apfpVar2.o) || !apfpVar.p.equals(apfpVar2.p) || !apfpVar.B.equals(apfpVar2.B)) {
                        return false;
                    }
                } else if (apfpVar.o.equals(apfpVar2.o) || !apfpVar.p.equals(apfpVar2.p)) {
                }
                return true;
            }
        }
        ajwo ajwoVar4 = acraVar.f;
        aihl aihlVar = apef.b;
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar);
        ajwoVar4.c(aihlVarCheckIsLite5);
        if (!ajwoVar4.j.n(aihlVarCheckIsLite5.d)) {
            return false;
        }
        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite6);
        if (!ajwoVar.j.n(aihlVarCheckIsLite6.d)) {
            return false;
        }
        ajwo ajwoVar5 = acraVar.f;
        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aihlVar);
        ajwoVar5.c(aihlVarCheckIsLite7);
        Object objK3 = ajwoVar5.j.k(aihlVarCheckIsLite7.d);
        apef apefVar = (apef) (objK3 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK3));
        aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite8);
        Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite8.d);
        return apefVar.equals((apef) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4)));
    }

    public final Set X(int i, int i2, int i3) {
        List list;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        synchronized (this.e) {
            int iMax = Math.max(0, i);
            while (true) {
                int iMin = Math.min(this.f.size(), i2);
                list = this.f;
                if (iMax >= iMin) {
                    break;
                }
                acra acraVar = (acra) list.get(iMax);
                acrp acrpVar = acraVar.i;
                if (acrpVar != null) {
                    acrpVar.M();
                    acrpVar.L();
                }
                hashSet.add(acraVar);
                ajwo ajwoVar = acraVar.f;
                if (ajwoVar != null) {
                    arrayList.add(ajwoVar);
                }
                iMax++;
            }
            list.removeAll(hashSet);
        }
        jW();
        if (!hashSet.isEmpty()) {
            aciz acizVarJ = this.o.j();
            acizVarJ.k(i3);
            acizVarJ.j(adif.g(aawo.i(arrayList)));
            acizVarJ.g();
        }
        return hashSet;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023 A[Catch: all -> 0x0051, TryCatch #0 {, blocks: (B:8:0x000d, B:11:0x0016, B:13:0x0023, B:15:0x0027), top: B:26:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    public final void Y(long j, int i) {
        acra acraVar;
        ajwo ajwoVar;
        agke agkeVarI;
        int iA = A(j);
        if (iA != -1) {
            synchronized (this.e) {
                boolean z = false;
                if (iA >= 0) {
                    if (iA < this.f.size()) {
                        z = true;
                    }
                    ahno.F(z);
                    acraVar = (acra) this.f.remove(iA);
                    if (acraVar != null) {
                        ajwoVar = acraVar.f;
                    } else {
                        ajwoVar = null;
                    }
                } else {
                    ahno.F(z);
                    acraVar = (acra) this.f.remove(iA);
                    if (acraVar != null) {
                        ajwoVar = acraVar.f;
                    } else {
                        ajwoVar = null;
                    }
                }
                throw th;
            }
            n(iA);
            aciz acizVarJ = this.o.j();
            acizVarJ.k(i);
            if (ajwoVar != null) {
                agkeVarI = aawo.i(agke.q(ajwoVar));
            } else {
                agkeVarI = agpi.a;
                agkeVarI.getClass();
            }
            acizVarJ.j(adif.g(agkeVarI));
            acizVarJ.g();
        }
    }

    @Override // defpackage.nh
    public final int a() {
        int size;
        synchronized (this.e) {
            size = this.f.size() + (this.v ? 1 : 0);
        }
        return size;
    }

    @Override // defpackage.nh
    public final int b(int i) {
        if (i < 0) {
            return 10000;
        }
        acra acraVarL = L(i);
        if (acraVarL != null) {
            apfp apfpVarC = acraVarL.c();
            if (aecm.as(acraVarL.f)) {
                return 10011;
            }
            if (this.n.aP() && acraVarL.l()) {
                return 10010;
            }
            apgb apgbVar = apfpVarC.m;
            if (apgbVar == null) {
                apgbVar = apgb.a;
            }
            int iBe = a.be(apgbVar.b);
            if (iBe != 0) {
                if (iBe != 1) {
                    apgb apgbVar2 = apfpVarC.m;
                    if (apgbVar2 == null) {
                        apgbVar2 = apgb.a;
                    }
                    int iBe2 = a.be(apgbVar2.b);
                    return (iBe2 != 0 ? iBe2 : 1) - 1;
                }
            }
            Optional.empty().isPresent();
        }
        if (i < D()) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/pager/ReelPageAdapter", "getItemViewType", 2158, "ReelPageAdapter.java")).u("ReelPageAdapter.getItemViewType unknown type at adapter position %d. Assigning end page type.", i);
        }
        return 10001;
    }

    @Override // defpackage.nh
    public final long c(int i) {
        if (i < 0) {
            return Long.MIN_VALUE;
        }
        acra acraVarL = L(i);
        if (acraVarL == null) {
            return Long.MAX_VALUE;
        }
        long j = acraVarL.a;
        return j != 0 ? j : acraVarL.b;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9, types: [awmd, java.lang.Object] */
    @Override // defpackage.nh
    public final /* synthetic */ oh e(ViewGroup viewGroup, int i) {
        oh acpzVar;
        awmd awmdVar;
        if (i == 10011) {
            aciz acizVar = this.z;
            tqj tqjVar = (tqj) acizVar.b.io();
            tqjVar.getClass();
            aenu aenuVar = (aenu) acizVar.a.io();
            aenuVar.getClass();
            viewGroup.getClass();
            return new acqd(tqjVar, aenuVar, viewGroup);
        }
        Map map = this.q;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf) || (awmdVar = (awmd) map.get(numValueOf)) == null) {
            Optional.empty().isPresent();
            if (i != 10000 && i != 10001) {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/pager/ReelPageAdapter", "onCreateViewHolder", 2065, "ReelPageAdapter.java")).u("ReelPageAdapter.onCreateViewHolder received unknown view type %d. Creating as end page view holder.", i);
            }
            acqz acqzVar = this.g;
            boolean z = acqzVar.b.m && this.x.l(77, 45634984L, false);
            aciz acizVar2 = this.A;
            boolean z2 = acqzVar.D;
            boolean z3 = i == 10000;
            tqj tqjVar2 = (tqj) acizVar2.b.io();
            tqjVar2.getClass();
            aenu aenuVar2 = (aenu) acizVar2.a.io();
            aenuVar2.getClass();
            viewGroup.getClass();
            acpzVar = new acpz(tqjVar2, aenuVar2, viewGroup, z2, z3, z);
        } else {
            acvv acvvVar = (acvv) awmdVar.io();
            aehs aehsVar = this.y;
            tqj tqjVar3 = (tqj) aehsVar.a.io();
            tqjVar3.getClass();
            aenu aenuVar3 = (aenu) aehsVar.e.io();
            aenuVar3.getClass();
            acph acphVar = (acph) aehsVar.d.io();
            hno hnoVar = (hno) aehsVar.b.io();
            hnoVar.getClass();
            acvc acvcVar = (acvc) aehsVar.c.io();
            aawo aawoVar = (aawo) aehsVar.f.io();
            acvg acvgVar = (acvg) aehsVar.g.io();
            Executor executor = (Executor) aehsVar.h.io();
            executor.getClass();
            avmb avmbVar = (avmb) aehsVar.i.io();
            avmbVar.getClass();
            viewGroup.getClass();
            acvvVar.getClass();
            acpzVar = new acrs(tqjVar3, aenuVar3, acphVar, hnoVar, acvcVar, aawoVar, acvgVar, executor, avmbVar, viewGroup, acvvVar);
        }
        return acpzVar;
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ void o(oh ohVar, int i) throws Throwable {
        acrp acrpVar = (acrp) ohVar;
        acra acraVarL = L(i);
        if (acraVarL != null) {
            acrpVar.K(acraVarL);
        }
        acqz acqzVar = this.g;
        acqzVar.f.f("r_bind");
        ReelRecyclerView reelRecyclerView = acqzVar.y;
        if (reelRecyclerView != null) {
            reelRecyclerView.getContext();
        }
        tqj tqjVar = acqzVar.h;
        int i2 = tqr.a;
        if (!tqjVar.l(1074025686, 1) || !a.x()) {
            acqzVar.j.schedule(afwl.i(new rir(acqzVar, i, 14)), 0L, TimeUnit.MILLISECONDS);
        } else if (i == acqzVar.Q) {
            acqzVar.n(false);
        }
    }

    @Override // defpackage.nh
    public final /* synthetic */ void s(oh ohVar) {
        ((acrp) ohVar).M();
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ boolean u(oh ohVar) {
        return true;
    }

    public final int z() {
        int size;
        synchronized (this.e) {
            size = -1;
            if (this.v && this.j) {
                size = this.f.size();
            }
        }
        return size;
    }
}
