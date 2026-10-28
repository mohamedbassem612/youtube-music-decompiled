package defpackage;

import android.content.Context;
import android.text.Spanned;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class accc {
    public final aopz a;
    public aopx b;
    public int c;
    private final String d;
    private final boolean e;
    private final String f;
    private final String g;

    private accc(String str, boolean z, aopz aopzVar, String str2, String str3) {
        this.d = str;
        this.a = aopzVar;
        this.e = z;
        this.f = str2;
        this.g = str3;
        int i = aopzVar.e;
        aopx aopxVar = null;
        if (i >= 0 && i < aopzVar.c.size()) {
            aopxVar = (aopx) aopzVar.c.get(aopzVar.e);
        }
        this.b = aopxVar;
        this.c = aopzVar.e;
    }

    public static accc e(wjf wjfVar, Context context) {
        return f(wjfVar.G(), wjfVar.x(), wjfVar.R(), context.getString(R.string.turn_off_subtitles), context.getString(R.string.auto_translate_subtitles));
    }

    public static accc f(String str, aopz aopzVar, boolean z, String str2, String str3) {
        if (str == null || aopzVar == null) {
            return null;
        }
        return new accc(str, z, aopzVar, str2, str3);
    }

    private final acca i(aopy aopyVar) {
        acbz acbzVarA = a(aopyVar);
        acbzVarA.g(false);
        return acbzVarA.a();
    }

    public final acbz a(aopy aopyVar) {
        alay alayVar;
        acbz acbzVarA = acca.a();
        acbzVarA.i(aopyVar.f);
        acbzVarA.n(this.d);
        acbzVarA.o(aopyVar.e);
        acbzVarA.m(aopyVar.c);
        if ((aopyVar.b & 16) != 0) {
            alayVar = aopyVar.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        acbzVarA.c = ackj.k(null, alayVar, null, false);
        acbzVarA.f(this.e);
        acbzVarA.h((aopyVar.b & SemanticState.Hidden) != 0 ? aopyVar.g : "");
        return acbzVarA;
    }

    public final acca b() {
        int i;
        aopx aopxVar = this.b;
        if (aopxVar != null && aopxVar.f && (i = aopxVar.e) >= 0) {
            aopz aopzVar = this.a;
            if (i < aopzVar.b.size()) {
                return i((aopy) aopzVar.b.get(aopxVar.e));
            }
        }
        return null;
    }

    public final acca c(String str) {
        aopx aopxVar;
        if (str != null && (aopxVar = this.b) != null) {
            Iterator it = aopxVar.d.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (iIntValue >= 0) {
                    aopz aopzVar = this.a;
                    if (iIntValue < aopzVar.b.size() && ((aopy) aopzVar.b.get(iIntValue)).f.equals(str)) {
                        return i((aopy) aopzVar.b.get(iIntValue));
                    }
                }
            }
        }
        return null;
    }

    public final accb d() {
        accb accbVar;
        aopx aopxVar = this.b;
        if (aopxVar == null) {
            return accb.a;
        }
        accb accbVar2 = accb.a;
        if ((aopxVar.b & 64) != 0) {
            Map map = accb.f;
            ajok ajokVarA = ajok.a(aopxVar.j);
            if (ajokVarA == null) {
                ajokVarA = ajok.CAPTIONS_INITIAL_STATE_UNKNOWN;
            }
            accbVar = (accb) tym.R(map, ajokVarA, accb.a);
        } else {
            Map map2 = accb.e;
            aopw aopwVarA = aopw.a(aopxVar.i);
            if (aopwVarA == null) {
                aopwVarA = aopw.UNKNOWN;
            }
            accbVar = (accb) tym.R(map2, aopwVarA, accb.a);
        }
        return accbVar == null ? accb.a : accbVar;
    }

    public final List g() {
        acca accaVarI;
        alay alayVar;
        ArrayList arrayList = new ArrayList();
        aopz aopzVar = this.a;
        if (aopzVar.b.size() != 0 && aopzVar.d.size() != 0 && aopzVar.c.size() != 0 && this.b != null && aopzVar.f.size() != 0) {
            for (aoqa aoqaVar : aopzVar.d) {
                if (!aoqaVar.f.contains(Integer.valueOf(this.c))) {
                    aopx aopxVar = this.b;
                    if (aopxVar == null) {
                        accaVarI = null;
                        break;
                    }
                    Iterator it = aoqaVar.e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Integer num = (Integer) it.next();
                            int iIntValue = num.intValue();
                            if (aopxVar.d.contains(num)) {
                                accaVarI = i((aopy) aopzVar.b.get(iIntValue));
                                break;
                            }
                        } else {
                            Iterator it2 = aopzVar.f.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    accaVarI = null;
                                    break;
                                }
                                Integer num2 = (Integer) it2.next();
                                int iIntValue2 = num2.intValue();
                                if (aopxVar.d.contains(num2)) {
                                    accaVarI = i((aopy) aopzVar.b.get(iIntValue2));
                                    break;
                                }
                            }
                        }
                    }
                    if (accaVarI != null) {
                        if ((aoqaVar.b & 2) != 0) {
                            alayVar = aoqaVar.d;
                            if (alayVar == null) {
                                alayVar = alay.a;
                            }
                        } else {
                            alayVar = null;
                        }
                        Spanned spannedK = ackj.k(null, alayVar, null, false);
                        String str = aoqaVar.c;
                        String string = spannedK.toString();
                        acbz acbzVarA = acca.a();
                        acbzVarA.i(str);
                        acbzVarA.e("");
                        acbzVarA.n(accaVarI.d);
                        acbzVarA.o(acca.d(accaVarI.k, str));
                        acbzVarA.m(accaVarI.m + "&tlang=" + str);
                        acbzVarA.c = string;
                        arrayList.add(acbzVarA.a());
                    }
                }
            }
        }
        return arrayList;
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        aopz aopzVar = this.a;
        if (aopzVar.b.size() != 0 && aopzVar.c.size() != 0 && this.b != null) {
            arrayList.add(acca.b(this.f));
            aopx aopxVar = this.b;
            if (aopxVar != null) {
                Iterator it = aopxVar.d.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Integer) it.next()).intValue();
                    if (iIntValue >= 0 && iIntValue < aopzVar.b.size()) {
                        arrayList.add(i((aopy) aopzVar.b.get(iIntValue)));
                    }
                }
            }
            if (aopzVar.f.size() > 0 && !this.e) {
                String str = this.d;
                String str2 = this.g;
                acbz acbzVarA = acca.a();
                acbzVarA.i("AUTO_TRANSLATE_CAPTIONS_OPTION");
                acbzVarA.n(str);
                acbzVarA.e("");
                acbzVarA.o("");
                acbzVarA.m("");
                acbzVarA.c = str2;
                acbzVarA.g(false);
                arrayList.add(acbzVarA.a());
            }
        }
        return arrayList;
    }
}
