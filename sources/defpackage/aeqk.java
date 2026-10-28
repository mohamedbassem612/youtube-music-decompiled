package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aeqk implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aeqk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v11, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v43, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v45, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v47, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v49, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v51, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v53, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v57, types: [agof, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v58, types: [agwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9, types: [awqg, java.lang.Object] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        Object affgVar;
        switch (this.$cid) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Iterator<String> it = bundle.keySet().iterator();
                int length = 0;
                while (it.hasNext()) {
                    length += bundle.getString(it.next(), "").length();
                }
                ((qtc) ((aeql) this.a).c.e.io()).b(length, new Object[0]);
                return bundle;
            case 1:
                ((agrc) ((agrc) ((agrc) aeql.a.b()).j((Exception) obj)).k("com/google/android/libraries/youtube/systemhealth/feedback/FeedbackDataTracker", "getFeedbackDataAsync", 79, "FeedbackDataTracker.java")).t("Failed to execute all blocking psd fillers.");
                return this.a;
            case 2:
                return this.a.invoke(obj);
            case 3:
                return this.a.invoke(obj);
            case 4:
                return this.a.invoke(obj);
            case 5:
                Intent intent = (Intent) obj;
                Object obj2 = this.a;
                afuu afuuVarC = afwt.c(114, "AccountUiService useIntent");
                try {
                    affgVar = new affg(null, afhq.a, null, intent, (afff) obj2);
                    afuuVarC.close();
                    break;
                } catch (Throwable th) {
                    try {
                        afuuVarC.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
                break;
            case 6:
                aihf builder = ((afie) obj).toBuilder();
                builder.clear();
                long epochMilli = ((afid) this.a).b.f().toEpochMilli();
                builder.copyOnWrite();
                afie afieVar = (afie) builder.instance;
                afieVar.b |= 2;
                afieVar.d = epochMilli;
                return (afie) builder.build();
            case 7:
                afhq afhqVar = ((afhn) obj).b;
                if (((String) ((agfa) ((abhh) this.a).a).a).equals(afhqVar.f)) {
                    return afhqVar.e;
                }
                return null;
            case 8:
                return ((ayq) this.a).b;
            case 9:
                return ((ayq) this.a).b;
            case 10:
                return ((ayq) this.a).b;
            case 11:
                int i = afmc.b;
                return this.a.invoke(obj);
            case 12:
                int i2 = afmc.b;
                return this.a.invoke(obj);
            case 13:
                int i3 = afmc.b;
                return this.a.invoke(obj);
            case 14:
                syn synVar = afnp.m;
                return this.a.invoke(obj);
            case 15:
                syn synVar2 = afnp.m;
                return this.a.invoke(obj);
            case 16:
                syn synVar3 = afnp.m;
                return this.a.invoke(obj);
            case 17:
                return new ahub((asib) obj);
            case 18:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                affgVar = new agob(entry, this.a);
                break;
            case 19:
                agwk agwkVar = (agwk) obj;
                Object objI = this.a.i(agwkVar.a, agwkVar.b);
                objI.getClass();
                return objI;
            default:
                ahuu ahuuVar = (ahuu) this.a;
                aglz aglzVar = ahuuVar.c;
                String str = ahuuVar.a;
                Uri uri = Uri.parse(str);
                HashSet hashSet = new HashSet(aglzVar.q());
                HashSet hashSet2 = new HashSet(uri.getQueryParameterNames());
                agkf agkfVar = new agkf();
                agkfVar.c(aglzVar);
                Uri.Builder builderBuildUpon = uri.buildUpon();
                for (ahuv ahuvVar : (List) obj) {
                    for (ahur ahurVar : ahuvVar.a().q()) {
                        if (!hashSet.add(ahurVar)) {
                            throw new ahuw(String.format("Duplicate header key: %s", ahurVar.a));
                        }
                    }
                    for (String str2 : ahuvVar.b().q()) {
                        if (!hashSet2.add(str2)) {
                            throw new ahuw(String.format("Duplicate url parameter key: %s", str2));
                        }
                    }
                    agkfVar.c(ahuvVar.a());
                    agqr it2 = ahuvVar.b().j().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        builderBuildUpon.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                ahus ahusVar = new ahus();
                ahusVar.a(aglzVar);
                int i4 = ahuuVar.f;
                if (i4 != 0 && i4 != 1 && i4 != 2) {
                    i4 = 3;
                }
                ahusVar.d = i4;
                ahusVar.c = ahuuVar.e;
                agkz agkzVar = ahuuVar.i;
                Set set = ahusVar.h;
                set.addAll(agkzVar);
                if (str != null) {
                    ahusVar.c(str);
                }
                String str3 = ahuuVar.g;
                if (str3 != null) {
                    ahusVar.b(str3);
                }
                if (ahuuVar.b) {
                    ahusVar.f = true;
                }
                Long l = ahuuVar.h;
                if (l != null) {
                    l.longValue();
                    ahusVar.g = l;
                }
                Integer num = ahuuVar.j;
                if (num != null) {
                    num.intValue();
                    ahusVar.i = num;
                }
                Integer num2 = ahuuVar.k;
                if (num2 != null) {
                    num2.intValue();
                    ahusVar.j = num2;
                }
                set.clear();
                ahusVar.b.r();
                ahusVar.c(builderBuildUpon.build().toString());
                ahusVar.a(agkfVar.a());
                return new ahuu(ahusVar);
        }
        return affgVar;
    }
}
