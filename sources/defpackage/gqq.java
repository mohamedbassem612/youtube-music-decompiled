package defpackage;

import android.content.pm.ShortcutManager;
import android.database.Cursor;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gqq implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gqq(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        boolean z = false;
        int i = 2;
        switch (this.$cid) {
            case 0:
                agke agkeVar = (agke) Collection.EL.stream((List) obj).filter(new gqn(z ? 1 : 0)).collect(aghu.a);
                ShortcutManager shortcutManager = ((gqs) this.a).c;
                shortcutManager.removeAllDynamicShortcuts();
                shortcutManager.setDynamicShortcuts(agkeVar);
                return null;
            case 1:
                int i2 = cbt.a;
                return this.a;
            case 2:
                return ((hvg) aguu.aw(((hvh) this.a).f, hvg.class, (affd) obj)).f();
            case 3:
                int i3 = hvo.e;
                ailw ailwVar = ailw.a;
                ailw ailwVar2 = (ailw) ((ailg) obj).b.get(this.a);
                return ailwVar2 != null ? ailwVar2 : ailwVar;
            case 4:
                return this.a;
            case 5:
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((aimh) obj).b);
                ibg ibgVar = (ibg) this.a;
                aima aimaVar = (aima) j$.util.Map.EL.getOrDefault(mapUnmodifiableMap, ibgVar.b(), aima.a);
                return (ibg.d(aimaVar) || ibgVar.b.f().toEpochMilli() - aimaVar.c > ibg.a) ? Optional.empty() : Optional.of(aimaVar);
            case 6:
                ?? r7 = this.a;
                agrf agrfVar = idr.a;
                return (List) Collection.EL.stream(r7).filter(new hkn((Set) obj, 6)).collect(Collectors.toCollection(new idl(i)));
            case 7:
                return (aimd) j$.util.Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((aime) obj).b), ((idx) this.a).e.o(), aimd.a);
            case 8:
                return (aily) j$.util.Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((aimg) obj).c), ((idx) this.a).e.o(), aily.a);
            case 9:
                Map mapUnmodifiableMap2 = DesugarCollections.unmodifiableMap(((aimi) obj).b);
                String strT = ((hef) this.a).t();
                aimc aimcVar = aimc.a;
                aimc aimcVar2 = (aimc) j$.util.Map.EL.getOrDefault(mapUnmodifiableMap2, strT, aimcVar);
                return (aimcVar2.b.isEmpty() || aimcVar2.equals(aimcVar)) ? agpi.a : aimcVar2.b;
            case 10:
                return ((iqu) aguu.aw(((iqv) this.a).b, iqu.class, (affd) obj)).h();
            case 11:
                aimp aimpVarA = aimp.a(((aimq) obj).c);
                if (aimpVarA == null) {
                    aimpVarA = aimp.NOT_SET;
                }
                klc klcVar = (klc) this.a;
                klcVar.d = aimpVarA;
                return klcVar.d;
            case 12:
                Cursor cursor = (Cursor) obj;
                Object obj2 = this.a;
                if (cursor == null) {
                    ((iuo) obj2).g = 3;
                    return Boolean.FALSE;
                }
                try {
                    ((iuo) obj2).g = true == cursor.moveToFirst() ? 2 : 3;
                    jku.b(cursor);
                    int i4 = ((iuo) obj2).g;
                    z = i4 == 2;
                    if (i4 != 0) {
                        return Boolean.valueOf(z);
                    }
                    throw null;
                } catch (Throwable th) {
                    jku.b(cursor);
                    throw th;
                }
            case 13:
                Cursor cursor2 = (Cursor) obj;
                Object obj3 = this.a;
                if (cursor2 == null) {
                    ((iuo) obj3).h = 3;
                    return Boolean.FALSE;
                }
                try {
                    ((iuo) obj3).h = true == cursor2.moveToFirst() ? 2 : 3;
                    jku.b(cursor2);
                    int i5 = ((iuo) obj3).h;
                    boolean z2 = i5 == 2;
                    if (i5 != 0) {
                        return Boolean.valueOf(z2);
                    }
                    throw null;
                } catch (Throwable th2) {
                    jku.b(cursor2);
                    throw th2;
                }
            case 14:
                kir kirVar = (kir) obj;
                if (kirVar == null) {
                    return null;
                }
                aihh aihhVar = ((kic) this.a).m;
                aulk aulkVar = ((aulj) aihhVar.instance).l;
                if (aulkVar == null) {
                    aulkVar = aulk.a;
                }
                aihh aihhVar2 = (aihh) aulkVar.toBuilder();
                aulk aulkVar2 = ((aulj) aihhVar.instance).l;
                if (aulkVar2 == null) {
                    aulkVar2 = aulk.a;
                }
                ahxa ahxaVar = aulkVar2.e;
                if (ahxaVar == null) {
                    ahxaVar = ahxa.a;
                }
                aihf builder = ahxaVar.toBuilder();
                String strB = kirVar.b();
                builder.copyOnWrite();
                ahxa ahxaVar2 = (ahxa) builder.instance;
                strB.getClass();
                ahxaVar2.c = strB;
                ahwz ahwzVarA = kirVar.a();
                builder.copyOnWrite();
                ahxa ahxaVar3 = (ahxa) builder.instance;
                ahwzVarA.getClass();
                ahxaVar3.d = ahwzVarA;
                ahxaVar3.b |= 1;
                aihhVar2.copyOnWrite();
                aulk aulkVar3 = (aulk) aihhVar2.instance;
                ahxa ahxaVar4 = (ahxa) builder.build();
                ahxaVar4.getClass();
                aulkVar3.e = ahxaVar4;
                aulkVar3.b |= 4;
                aulk aulkVar4 = (aulk) aihhVar2.build();
                aihhVar.copyOnWrite();
                aulj auljVar = (aulj) aihhVar.instance;
                aulkVar4.getClass();
                auljVar.l = aulkVar4;
                auljVar.b |= 268435456;
                return null;
            case 15:
                return ((kjn) this.a).c((kic) obj, kiz.d);
            case 16:
                return this.a;
            case 17:
                obq obqVar = (obq) obj;
                ((obw) this.a).b.set(obqVar);
                return obqVar;
            case 18:
                String str = (String) obj;
                return ahno.aa(str) ? rpi.z(((oeo) this.a).a) : str;
            case 19:
                List<omh> list = (List) obj;
                agjz agjzVar = new agjz(4);
                oik oikVar = (oik) this.a;
                if (oikVar.a) {
                    agjzVar.j(list);
                    return agjzVar.g();
                }
                for (omh omhVar : list) {
                    agev agevVar = oikVar.b;
                    oiw oiwVar = omhVar.a;
                    oip oipVar = omhVar.b;
                    if (!agevVar.g() || TextUtils.equals(agevVar.c(), oiwVar.c)) {
                        agjzVar.h(omhVar);
                    }
                }
                return agjzVar.g();
            default:
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                ((ong) ((omn) this.a).a).j(1036);
                onb.c("%s: Failed to remove expired groups!", "ExpirationHandler");
                return null;
        }
    }
}
