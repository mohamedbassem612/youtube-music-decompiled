package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class agvp {
    private agvp() {
    }

    public static void A(Class cls, Class cls2, ahhx ahhxVar, Map map) {
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(a.cs(cls, "PrimitiveWrapper for ", " already added."));
        }
        map.put(cls, new ahtv(cls2, ahhxVar));
    }

    public static void B(Enum r0, Object obj, Map map, Map map2) {
        map.put(r0, obj);
        map2.put(obj, r0);
    }

    public static ahtv C(Map map, Map map2) {
        return new ahtv(DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(map2));
    }

    public static int D(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 100) {
            return 101;
        }
        if (i == 1000) {
            return 1001;
        }
        switch (i) {
            case 150:
                return 151;
            case 151:
                return 152;
            case 152:
                return 153;
            case 153:
                return 154;
            default:
                return 0;
        }
    }

    public static int E(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
            default:
                return 0;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
        }
    }

    public static /* synthetic */ String F(int i) {
        if (i == 1) {
            return "OFFLINE_ORCHESTRATION_ACTION_TYPE_UNKNOWN";
        }
        if (i == 2) {
            return "OFFLINE_ORCHESTRATION_ACTION_TYPE_ADD";
        }
        if (i != 3) {
            return i != 4 ? "OFFLINE_ORCHESTRATION_ACTION_TYPE_UPDATE" : "OFFLINE_ORCHESTRATION_ACTION_TYPE_REFRESH";
        }
        return "OFFLINE_ORCHESTRATION_ACTION_TYPE_DELETE";
    }

    public static int G(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            default:
                return 0;
        }
    }

    public static int H(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            default:
                switch (i) {
                    case 90:
                        return 91;
                    case 91:
                        return 92;
                    case 92:
                        return 93;
                    case 93:
                        return 94;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ aoar I(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (aoar) aihnVarBuild;
    }

    public static void J(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aoar aoarVar = (aoar) aihfVar.instance;
        aoar aoarVar2 = aoar.a;
        aoarVar.b |= SemanticState.ReadOnly;
        aoarVar.k = str;
    }

    public static void K(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aoar aoarVar = (aoar) aihfVar.instance;
        aoar aoarVar2 = aoar.a;
        aoarVar.b |= SemanticState.Focused;
        aoarVar.h = i;
    }

    public static void L(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aoar aoarVar = (aoar) aihfVar.instance;
        aoar aoarVar2 = aoar.a;
        aoarVar.b |= 1;
        aoarVar.c = str;
    }

    public static void M(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aoar aoarVar = (aoar) aihfVar.instance;
        aoar aoarVar2 = aoar.a;
        aoarVar.b |= 4;
        aoarVar.e = i;
    }

    public static void N(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aoar aoarVar = (aoar) aihfVar.instance;
        aoar aoarVar2 = aoar.a;
        aoarVar.b |= 2;
        aoarVar.d = i;
    }

    public static /* synthetic */ anoe O(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (anoe) aihnVarBuild;
    }

    public static void P(anuu anuuVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        anoe anoeVar = (anoe) aihfVar.instance;
        anoe anoeVar2 = anoe.a;
        anoeVar.c = anuuVar;
        anoeVar.b = 5;
    }

    public static /* synthetic */ anfb Q(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (anfb) aihnVarBuild;
    }

    public static void R(amzw amzwVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        anfb anfbVar = (anfb) aihfVar.instance;
        anfb anfbVar2 = anfb.a;
        anfbVar.d = Integer.valueOf(amzwVar.p);
        anfbVar.c = 2;
    }

    public static int S(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            default:
                return 0;
        }
    }

    public static int T(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 14:
            default:
                return 0;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
        }
    }

    public static /* synthetic */ amzx U(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (amzx) aihnVarBuild;
    }

    public static /* synthetic */ void V(aihf aihfVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((amzx) aihfVar.instance).i);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static /* synthetic */ amsy W(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (amsy) aihnVarBuild;
    }

    public static void X(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        amsy amsyVar = (amsy) aihfVar.instance;
        amsy amsyVar2 = amsy.a;
        amsyVar.b |= 1;
        amsyVar.c = str;
    }

    public static int Y(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i2 = 5;
            if (i != 4) {
                if (i != 5) {
                    return i != 6 ? 0 : 7;
                }
                return 6;
            }
        }
        return i2;
    }

    public static /* synthetic */ amiw Z(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (amiw) aihnVarBuild;
    }

    public static void a(String str, Object... objArr) {
        System.err.println(agvp.class.toString() + ": " + String.format(str, objArr));
    }

    public static void aa(amjr amjrVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        amiw amiwVar = (amiw) aihfVar.instance;
        amiw amiwVar2 = amiw.a;
        amiwVar.e = amjrVar.o;
        amiwVar.b |= 8;
    }

    public static /* synthetic */ amiu ab(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (amiu) aihnVarBuild;
    }

    public static void ac(amiw amiwVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        amiu amiuVar = (amiu) aihfVar.instance;
        amiu amiuVar2 = amiu.a;
        amiuVar.N = amiwVar;
        amiuVar.d |= 8;
    }

    public static void ad(aihf aihfVar) {
        aihfVar.copyOnWrite();
        amiu amiuVar = (amiu) aihfVar.instance;
        amiu amiuVar2 = amiu.a;
        amiuVar.b |= SemanticState.Focused;
        amiuVar.j = "warm";
    }

    public static void ae(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        amiu amiuVar = (amiu) aihfVar.instance;
        amiu amiuVar2 = amiu.a;
        amiuVar.f = i - 1;
        amiuVar.b |= 4;
    }

    public static /* synthetic */ String af(int i) {
        switch (i) {
            case 4:
                return "HOST_CLIENT_NAME_MAIN_ANDROID";
            case 5:
                return "HOST_CLIENT_NAME_MAIN_IOS";
            case 6:
                return "HOST_CLIENT_NAME_FAMILY_LINK_WEB";
            case 7:
                return "HOST_CLIENT_NAME_FAMILY_LINK_ANDROID";
            case 8:
                return "HOST_CLIENT_NAME_FAMILY_LINK_IOS";
            case 9:
                return "HOST_CLIENT_NAME_WEB_KIDS";
            case 10:
                return "HOST_CLIENT_NAME_MUSIC_WEB";
            default:
                return "HOST_CLIENT_NAME_MUSIC_ANDROID";
        }
    }

    public static char[] c(char[] cArr, int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    public static void d(byte[] bArr, File file, agkz agkzVar) throws IOException {
        bArr.getClass();
        FileOutputStream fileOutputStreamE = e(file, agkzVar);
        try {
            fileOutputStreamE.write(bArr);
            fileOutputStreamE.close();
        } catch (Throwable th) {
            try {
                fileOutputStreamE.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static FileOutputStream e(File file, agkz agkzVar) {
        return new FileOutputStream(file, agkzVar.contains(agyl.APPEND));
    }

    public static agxz f(agya agyaVar) {
        return new agxz(agyaVar.b);
    }

    public static boolean g(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = agpb.a;
            }
        } else {
            if (!(iterable instanceof agqk)) {
                return false;
            }
            comparator2 = ((agqk) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    public static void h(agom agomVar, ObjectInputStream objectInputStream, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collectionC = agomVar.c(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collectionC.add(objectInputStream.readObject());
            }
        }
    }

    public static void i(agom agomVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(agomVar.n().size());
        for (Map.Entry entry : agomVar.n().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static boolean j(agow agowVar, Object obj) {
        if (obj == agowVar) {
            return true;
        }
        if (obj instanceof agow) {
            agow agowVar2 = (agow) obj;
            if (agowVar.size() == agowVar2.size() && agowVar.j().size() == agowVar2.j().size()) {
                for (agox agoxVar : agowVar2.j()) {
                    if (agowVar.a(agoxVar.a) != agoxVar.a()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static aglz k(agoq agoqVar) {
        return new agos(agoqVar.a(), new agop());
    }

    public static ahjq l(ahjo ahjoVar, ahkk ahkkVar, ahlo ahloVar, Integer num) throws GeneralSecurityException {
        ahnf ahnfVarB;
        if (ahjoVar.S() && num == null) {
            throw new GeneralSecurityException("ID requirement is not set");
        }
        if (!ahjoVar.S() && num != null) {
            throw new GeneralSecurityException("ID requirement is set");
        }
        ahki ahkiVar = ahkkVar.a;
        ahkh ahkhVar = ahkiVar.b;
        if (ahkhVar != ahkh.b) {
            throw new GeneralSecurityException("ML-DSA variant must be NO_PREFIX, found " + ahkhVar.c + " instead");
        }
        ahjm ahjmVar = ahjoVar.a;
        if ((ahjmVar != ahjm.a || ahkiVar.a != ahkg.a) && ((ahjmVar != ahjm.b || ahkiVar.a != ahkg.b) && (ahjmVar != ahjm.c || ahkiVar.a != ahkg.c))) {
            throw new GeneralSecurityException("ML-DSA instance does not match");
        }
        ahjl ahjlVar = ahjoVar.b;
        Map map = ahjq.a;
        if (!map.containsKey(ahjlVar)) {
            throw new GeneralSecurityException("Unknown classical algorithm");
        }
        if (!ahloVar.d().equals(map.get(ahjlVar))) {
            throw new GeneralSecurityException("Classical algorithm does not match");
        }
        ahjn ahjnVar = ahjoVar.c;
        if (ahjnVar == ahjn.b) {
            ahnfVarB = ahhk.a;
        } else {
            if (ahjnVar != ahjn.a) {
                throw new IllegalStateException("Unknown CompositeMlDsaParameters.Variant: ".concat(ahjnVar.c));
            }
            ahnfVarB = ahhk.b(num.intValue());
        }
        return new ahjq(ahjoVar, ahkkVar, ahloVar, ahnfVarB, num);
    }

    public static int m(int i) {
        return i == 1 ? aiif.a() : i - 2;
    }

    public static int n(int i) {
        return i == 1 ? aiif.a() : i - 2;
    }

    public static int o(int i) {
        return i == 1 ? aiif.a() : i - 2;
    }

    public static int p(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 6;
    }

    public static int q(int i) {
        return i == 1 ? aiif.a() : i - 2;
    }

    public static ahfz r(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 0) {
            return ahfz.a;
        }
        if (i2 == 1) {
            return ahfz.b;
        }
        if (i2 == 2) {
            return ahfz.c;
        }
        if (i2 == 3) {
            return ahfz.d;
        }
        if (i2 == 4) {
            return ahfz.e;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(Integer.toString(i2)));
    }

    public static ahga s(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 0) {
            return ahga.a;
        }
        if (i2 == 1) {
            return ahga.b;
        }
        if (i2 == 2) {
            return ahga.c;
        }
        if (i2 == 3) {
            return ahga.d;
        }
        if (i2 == 4) {
            return ahga.e;
        }
        if (i2 == 5) {
            return ahga.f;
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(Integer.toString(i2)));
    }

    public static int t(ahfz ahfzVar) throws GeneralSecurityException {
        if (ahfzVar.equals(ahfz.a)) {
            return 2;
        }
        if (ahfzVar.equals(ahfz.b)) {
            return 3;
        }
        if (ahfzVar.equals(ahfz.c)) {
            return 4;
        }
        if (ahfzVar.equals(ahfz.d)) {
            return 5;
        }
        if (ahfzVar.equals(ahfz.e)) {
            return 6;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(ahfzVar.f));
    }

    public static void u(Class cls, ahgw ahgwVar, Map map) {
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(a.cs(cls, "KeyCreator for ", " already added."));
        }
        map.put(cls, ahgwVar);
    }

    public static void v(String str, ahhs ahhsVar, Map map) {
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(a.bT(str, "KeyParser for ", " already added."));
        }
        map.put(str, ahhsVar);
    }

    public static void w(Class cls, ahht ahhtVar, Map map) {
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(a.cs(cls, "KeySerializer for ", " already added."));
        }
        map.put(cls, ahhtVar);
    }

    public static void x(String str, ahhu ahhuVar, Map map) {
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(a.bT(str, "ParametersParser for ", " already added."));
        }
        map.put(str, ahhuVar);
    }

    public static void y(Class cls, ahhv ahhvVar, Map map) {
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(a.cs(cls, "ParametersSerializer for ", " already added."));
        }
        map.put(cls, ahhvVar);
    }

    public static void z(ahhm ahhmVar, Class cls, Class cls2, Map map) {
        ahhw ahhwVar = new ahhw(cls, cls2);
        if (!map.containsKey(ahhwVar)) {
            map.put(ahhwVar, new awgg(cls, cls2, ahhmVar));
            return;
        }
        throw new IllegalArgumentException("PrimitiveConstructor for " + cls.toString() + " and primitive " + cls2.toString() + " already added.");
    }

    public String b(String str) {
        throw null;
    }

    protected agvp(byte[] bArr) {
    }
}
