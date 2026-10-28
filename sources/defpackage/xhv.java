package defpackage;

import android.database.Cursor;
import android.view.Surface;
import com.google.android.libraries.youtube.media.interfaces.FormatInitializationMetadataReceiver;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xhv implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xhv(aadt aadtVar, String str, List list, abxu abxuVar, int i) {
        this.$cid = i;
        this.b = aadtVar;
        this.a = str;
        this.d = list;
        this.c = abxuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [wxa] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v13, types: [yuo] */
    /* JADX WARN: Type inference failed for: r2v2, types: [acjx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, ywj] */
    /* JADX WARN: Type inference failed for: r4v15, types: [aadu] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r9v0, types: [ywn] */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        zhy zhyVar;
        switch (this.$cid) {
            case 0:
                xhw xhwVar = (xhw) this.a;
                xhwVar.a.h(xhwVar.b, ((xgj) this.b).a, ((xgx) this.c).a, (xie) this.d);
                return;
            case 1:
                ((wxa) this.c).u((wlu) this.b, this.a, this.d);
                return;
            case 2:
                xja xjaVar = (xja) ((xip) this.c).a.io();
                aftj aftjVar = new aftj();
                aftjVar.g((String) this.a);
                aftjVar.f((String) this.d);
                xjaVar.c(aftjVar.e(), (xie) this.b);
                return;
            case 3:
                ?? r1 = this.a;
                Object obj = this.b;
                Object obj2 = this.d;
                Object obj3 = this.c;
                try {
                    Set set = ((ygx) obj3).p;
                    synchronized (set) {
                        set.remove(obj2);
                        break;
                    }
                    ((ygl) obj).j();
                    return;
                } catch (IOException e) {
                    if (r1 != 0) {
                        r1.k(((hed) ((ygx) obj3).t.a).o(new jsi(e)));
                        return;
                    }
                    return;
                }
            case 4:
                yhq yhqVar = (yhq) this.c;
                if (yhqVar.e.get()) {
                    return;
                }
                Object obj4 = this.b;
                Set agqjVar = obj4 != null ? new agqj(obj4) : agpr.a;
                yno.o(agqjVar, yhqVar.g, yhqVar.f, yhqVar.a, this.d, (FormatInitializationMetadataReceiver) this.a);
                return;
            case 5:
                yul yulVar = (yul) this.c;
                zsf zsfVar = yulVar.d;
                Object obj5 = this.d;
                if (zsfVar != zsf.f) {
                    obj5 = ywn.b;
                }
                ?? r2 = yulVar.a;
                Object obj6 = this.a;
                r2.x((wgs) this.b, ((yun) obj6).a, null, null, null, obj5, Optional.empty());
                return;
            case 6:
                zea zeaVar = (zea) this.c;
                zeaVar.g = false;
                ywk ywkVar = zeaVar.f;
                ?? r3 = this.b;
                if (ywkVar == null) {
                    zhyVar = zhy.NULL_LOAD_VIDEO_PARAMS_ON_RETRY;
                } else {
                    if (r3 == zeaVar.d) {
                        this.d.run();
                        return;
                    }
                    zhyVar = zhy.STALE_PLAYER_EVENTS_ON_RETRY;
                }
                r3.h(((zhz) this.a).b(zhyVar));
                return;
            case 7:
                Object obj7 = this.b;
                Object obj8 = this.d;
                zen zenVar = zen.u;
                int iIdentityHashCode = System.identityHashCode(obj7);
                zlo zloVar = zlo.NONE;
                String string = ((StringBuilder) obj8).toString();
                Object obj9 = this.a;
                zek zekVar = (zek) this.c;
                zekVar.t(zenVar, (zsf) obj9, iIdentityHashCode, zloVar, string, null);
                zekVar.a = true;
                return;
            case 8:
                Object obj10 = this.b;
                Object obj11 = this.d;
                zen zenVar2 = zen.u;
                int iIdentityHashCode2 = System.identityHashCode(obj10);
                zlo zloVar2 = zlo.NONE;
                String string2 = ((StringBuilder) obj11).toString();
                Object obj12 = this.a;
                zet zetVar = (zet) this.c;
                zetVar.t(zenVar2, (zsf) obj12, iIdentityHashCode2, zloVar2, string2, null);
                zetVar.b = true;
                return;
            case 9:
                Object obj13 = this.d;
                Object obj14 = this.a;
                yno.ad(zvp.a, (zvn) this.c, (zvm) this.b, (String) obj14, (Throwable) obj13, agpn.b);
                return;
            case 10:
                Object obj15 = this.d;
                zvr zvrVar = (zvr) this.a;
                Map mapF = zvrVar.f((String) obj15);
                tyt tytVarE = zvrVar.e((zvn) this.c, (zvm) this.b, null);
                mapF.put("stacktrace.c++", null);
                mapF.put("stacktrace.java", "");
                zvrVar.k(tytVarE, mapF);
                return;
            default:
                ?? r4 = ((aadt) this.b).b;
                Object obj16 = this.c;
                Object obj17 = this.a;
                String str = (String) obj17;
                abxu abxuVar = (abxu) obj16;
                aohm aohmVarD = abxuVar.d(str);
                abxv abxvVar = r4.h;
                ?? r8 = abxvVar.b;
                String strY = r8.e().h() ? "main_app_auto_offline_storage_limit_megabytes_%s" : tym.y("main_app_auto_offline_storage_limit_megabytes_%s", r8.e().k());
                ?? r9 = abxvVar.a;
                long jE = 0;
                long j = r9.contains(strY) ? ((long) r9.getInt(strY, 0)) << 20 : 0L;
                long jB = abxvVar.b();
                if (j != 0) {
                    aazo aazoVar = (aazo) r4.b.io();
                    if (obj17 == null) {
                        throw new IllegalArgumentException("Either specify playlistId or videoListId");
                    }
                    ?? r5 = aazoVar.a;
                    aaok aaokVarAa = ((aaew) r5.io()).aa(str);
                    if (aaokVarAa != null) {
                        aaew aaewVar = (aaew) r5.io();
                        Iterator it = aaokVarAa.a.iterator();
                        while (it.hasNext()) {
                            aamt aamtVarF = aaewVar.f((String) it.next());
                            if (aamtVarF != null) {
                                jE += aamtVarF.e();
                            }
                        }
                    }
                    jB = Math.min(jB, j - jE);
                }
                long j2 = jB;
                aohx aohxVarE = abxuVar.e(str);
                Cursor cursorQuery = abxuVar.o().query("video_listsV13", new String[]{"stream_transfer_condition"}, "id = ?", new String[]{str}, null, null, null, null);
                try {
                    aamn aamnVarA = cursorQuery.moveToNext() ? aamn.a(cursorQuery.getInt(0)) : aamn.OFFLINE_IMMEDIATELY;
                    ?? r6 = this.d;
                    cursorQuery.close();
                    r4.i(str, r6, aohmVarD, j2, true, aohxVarE, aamnVarA, abxuVar.a(str), abxuVar.m(str));
                    return;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
        }
    }

    public /* synthetic */ xhv(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
        this.d = obj4;
    }

    public /* synthetic */ xhv(Object obj, zsf zsfVar, Surface surface, StringBuilder sb, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = zsfVar;
        this.b = surface;
        this.d = sb;
    }

    public /* synthetic */ xhv(xhw xhwVar, xgz xgzVar, xgz xgzVar2, xie xieVar, int i) {
        this.$cid = i;
        this.a = xhwVar;
        this.b = xgzVar;
        this.c = xgzVar2;
        this.d = xieVar;
    }

    public /* synthetic */ xhv(xip xipVar, String str, String str2, xie xieVar, int i) {
        this.$cid = i;
        this.c = xipVar;
        this.a = str;
        this.d = str2;
        this.b = xieVar;
    }

    public /* synthetic */ xhv(ygx ygxVar, String str, ygl yglVar, ywn ywnVar, int i) {
        this.$cid = i;
        this.c = ygxVar;
        this.d = str;
        this.b = yglVar;
        this.a = ywnVar;
    }

    public /* synthetic */ xhv(yhq yhqVar, jsk jskVar, ArrayList arrayList, FormatInitializationMetadataReceiver formatInitializationMetadataReceiver, int i) {
        this.$cid = i;
        this.c = yhqVar;
        this.b = jskVar;
        this.d = arrayList;
        this.a = formatInitializationMetadataReceiver;
    }

    public /* synthetic */ xhv(zvr zvrVar, zvn zvnVar, zvm zvmVar, String str, int i) {
        this.$cid = i;
        this.a = zvrVar;
        this.c = zvnVar;
        this.b = zvmVar;
        this.d = str;
    }
}
