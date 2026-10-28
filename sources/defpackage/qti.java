package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qti implements awmd {
    private static final List b;
    public volatile qth a;
    private final String e;
    private final Object d = new Object();
    private final Map c = new HashMap(10);

    static {
        new qti("");
        b = new ArrayList();
    }

    private qti(String str) {
        this.e = str;
    }

    public static long b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static synchronized qti d(String str) {
        List<qti> list = b;
        for (qti qtiVar : list) {
            if (qtiVar.e.equals(str)) {
            }
        }
        qtiVar = new qti(str);
        list.add(qtiVar);
        return qtiVar;
    }

    public final qtc c(String str, qte... qteVarArr) {
        qtc qtcVar;
        synchronized (this.d) {
            Map map = this.c;
            qtcVar = (qtc) map.get(str);
            if (qtcVar != null) {
                qtcVar.f(qteVarArr);
            } else {
                qtcVar = new qtc(str, this, qteVarArr);
                map.put(qtcVar.b, qtcVar);
            }
        }
        return qtcVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    public final agda e() {
        int i;
        ArrayList arrayList;
        ahwn ahwnVar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4 = new ArrayList();
        synchronized (this.d) {
            Iterator it = this.c.values().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                qtg qtgVar = (qtg) it.next();
                qte[] qteVarArr = qtgVar.c;
                HashMap map = new HashMap(qteVarArr.length > 0 ? 10 : 1);
                avbi avbiVar = new avbi(qtgVar.b, qteVarArr);
                synchronized (qtgVar.a) {
                    try {
                        avbiVar.d = qtgVar.d;
                        avbiVar.b = qtgVar.e;
                        qtgVar.d = map;
                        qtgVar.e = 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                arrayList4.add(avbiVar);
            }
        }
        aihf aihfVarCreateBuilder = agda.a.createBuilder();
        int size = arrayList4.size();
        int i2 = 0;
        while (i2 < size) {
            avbi avbiVar2 = (avbi) arrayList4.get(i2);
            if (avbiVar2.b == 0) {
                ahwnVar = null;
                arrayList = arrayList4;
            } else {
                aihf aihfVarCreateBuilder2 = ahwn.a.createBuilder();
                String str = (String) avbiVar2.a;
                long jB = b(str);
                aihfVarCreateBuilder2.copyOnWrite();
                ahwn ahwnVar2 = (ahwn) aihfVarCreateBuilder2.instance;
                ahwnVar2.b |= 2;
                ahwnVar2.c = jB;
                qte[] qteVarArr2 = (qte[]) avbiVar2.c;
                int length = qteVarArr2.length;
                for (int i3 = i; i3 < length; i3++) {
                    long jB2 = b(qteVarArr2[i3].a);
                    aihfVarCreateBuilder2.copyOnWrite();
                    ahwn ahwnVar3 = (ahwn) aihfVarCreateBuilder2.instance;
                    aihy aihyVar = ahwnVar3.d;
                    if (!aihyVar.c()) {
                        ahwnVar3.d = aihn.mutableCopy(aihyVar);
                    }
                    ahwnVar3.d.g(jB2);
                }
                for (Map.Entry entry : avbiVar2.d.entrySet()) {
                    aihf aihfVarCreateBuilder3 = ahwm.a.createBuilder();
                    qsy qsyVar = (qsy) entry.getKey();
                    qsz qszVar = (qsz) entry.getValue();
                    if (qteVarArr2.length > 0) {
                        Object[] objArr = qsyVar.c;
                        ArrayList arrayList5 = new ArrayList(objArr.length);
                        int i4 = 0;
                        while (i4 < objArr.length) {
                            aihf aihfVarCreateBuilder4 = ahwk.a.createBuilder();
                            Object obj = objArr[i4];
                            if (obj instanceof String) {
                                String str2 = (String) obj;
                                aihfVarCreateBuilder4.copyOnWrite();
                                ahwk ahwkVar = (ahwk) aihfVarCreateBuilder4.instance;
                                str2.getClass();
                                arrayList3 = arrayList4;
                                ahwkVar.b = 1;
                                ahwkVar.c = str2;
                            } else {
                                arrayList3 = arrayList4;
                                if (obj instanceof Integer) {
                                    Integer num = (Integer) obj;
                                    num.intValue();
                                    aihfVarCreateBuilder4.copyOnWrite();
                                    ahwk ahwkVar2 = (ahwk) aihfVarCreateBuilder4.instance;
                                    ahwkVar2.b = 2;
                                    ahwkVar2.c = num;
                                } else {
                                    if (!(obj instanceof Boolean)) {
                                        throw new IllegalArgumentException("Metric " + str + " has field " + i4 + " with an unexpected value: " + String.valueOf(obj));
                                    }
                                    Boolean bool = (Boolean) obj;
                                    bool.booleanValue();
                                    aihfVarCreateBuilder4.copyOnWrite();
                                    ahwk ahwkVar3 = (ahwk) aihfVarCreateBuilder4.instance;
                                    ahwkVar3.b = 3;
                                    ahwkVar3.c = bool;
                                }
                            }
                            arrayList5.add((ahwk) aihfVarCreateBuilder4.build());
                            i4++;
                            arrayList4 = arrayList3;
                        }
                        arrayList2 = arrayList4;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ahwm ahwmVar = (ahwm) aihfVarCreateBuilder3.instance;
                        aiie aiieVar = ahwmVar.c;
                        if (!aiieVar.c()) {
                            ahwmVar.c = aihn.mutableCopy(aiieVar);
                        }
                        aifs.addAll(arrayList5, ahwmVar.c);
                    } else {
                        arrayList2 = arrayList4;
                    }
                    ahwl ahwlVarA = qszVar.a();
                    aihfVarCreateBuilder3.copyOnWrite();
                    ahwm ahwmVar2 = (ahwm) aihfVarCreateBuilder3.instance;
                    ahwlVarA.getClass();
                    ahwmVar2.d = ahwlVarA;
                    ahwmVar2.b |= 1;
                    aihfVarCreateBuilder2.copyOnWrite();
                    ahwn ahwnVar4 = (ahwn) aihfVarCreateBuilder2.instance;
                    ahwm ahwmVar3 = (ahwm) aihfVarCreateBuilder3.build();
                    ahwmVar3.getClass();
                    aiie aiieVar2 = ahwnVar4.e;
                    if (!aiieVar2.c()) {
                        ahwnVar4.e = aihn.mutableCopy(aiieVar2);
                    }
                    ahwnVar4.e.add(ahwmVar3);
                    arrayList4 = arrayList2;
                }
                arrayList = arrayList4;
                ahwnVar = (ahwn) aihfVarCreateBuilder2.build();
            }
            if (ahwnVar != null) {
                aihfVarCreateBuilder.copyOnWrite();
                agda agdaVar = (agda) aihfVarCreateBuilder.instance;
                aiie aiieVar3 = agdaVar.b;
                if (!aiieVar3.c()) {
                    agdaVar.b = aihn.mutableCopy(aiieVar3);
                }
                agdaVar.b.add(ahwnVar);
            }
            i2++;
            arrayList4 = arrayList;
            i = 0;
        }
        return (agda) aihfVarCreateBuilder.build();
    }

    public final qtf f(String str, qte... qteVarArr) {
        qtf qtfVar;
        synchronized (this.d) {
            Map map = this.c;
            qtfVar = (qtf) map.get(str);
            if (qtfVar != null) {
                qtfVar.f(qteVarArr);
            } else {
                qtfVar = new qtf(str, this, qteVarArr);
                map.put(qtfVar.b, qtfVar);
            }
        }
        return qtfVar;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        return this.a;
    }
}
