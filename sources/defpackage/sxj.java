package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import j$.util.Optional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sxj {
    public final Map a;
    public final Map b;
    public volatile Optional c;
    public volatile Optional d;

    public sxj(vyo vyoVar, Optional optional, Optional optional2) {
        agkj agkjVar = agpn.b;
        this.a = (Map) optional.orElse(agkjVar);
        this.b = (Map) optional2.orElse(agkjVar);
        this.c = Optional.empty();
        this.d = Optional.empty();
        anin aninVar = vyoVar.b().g;
        ambw ambwVar = (aninVar == null ? anin.a : aninVar).h;
        ambwVar = ambwVar == null ? ambw.a : ambwVar;
        if (!ambwVar.equals(ambw.a)) {
            a(ambwVar);
        }
        final long jHashCode = ambwVar.hashCode();
        int i = 14;
        vyoVar.c(new rtq(i)).T(new avno() { // from class: sxi
            @Override // defpackage.avno
            public final boolean a(Object obj) {
                return ((long) ((ambw) obj).hashCode()) == jHashCode;
            }
        }).af(new sqk(this, i));
    }

    public final void a(ambw ambwVar) {
        Object obj;
        String str = ambwVar.b;
        int i = 4;
        agkh agkhVar = new agkh(4);
        agkh agkhVar2 = new agkh(4);
        for (akcp akcpVar : ambwVar.c) {
            agkh agkhVar3 = new agkh(i);
            for (airr airrVar : akcpVar.c) {
                String str2 = airrVar.b;
                agkh agkhVar4 = new agkh(i);
                for (akxf akxfVar : airrVar.c) {
                    String str3 = akxfVar.c;
                    agkx agkxVar = new agkx();
                    Iterator<E> it = new aihx(akxfVar.d, akxf.a).iterator();
                    while (it.hasNext()) {
                        switch (((akxg) it.next()).ordinal()) {
                            case 1:
                                obj = Boolean.class;
                                break;
                            case 2:
                                obj = String.class;
                                break;
                            case 3:
                                obj = Parcelable.class;
                                break;
                            case 4:
                                obj = Serializable.class;
                                break;
                            case 5:
                                obj = ArrayList.class;
                                break;
                            case 6:
                                obj = Uri.class;
                                break;
                            case 7:
                                obj = byte[].class;
                                break;
                            case 8:
                                obj = Long.class;
                                break;
                            case 9:
                                obj = Integer.class;
                                break;
                            case 10:
                                obj = String[].class;
                                break;
                            case 11:
                                obj = Bundle.class;
                                break;
                            case 12:
                                obj = Byte.TYPE;
                                break;
                            case 13:
                                obj = Character.TYPE;
                                break;
                            case 14:
                                obj = char[].class;
                                break;
                            case 15:
                                obj = CharSequence.class;
                                break;
                            case 16:
                                obj = CharSequence[].class;
                                break;
                            case 17:
                                obj = Float.TYPE;
                                break;
                            case 18:
                                obj = float[].class;
                                break;
                            case 19:
                                obj = Parcelable[].class;
                                break;
                            case 20:
                                obj = Short.TYPE;
                                break;
                            case 21:
                                obj = short[].class;
                                break;
                            case 22:
                                obj = Size.class;
                                break;
                            case 23:
                                obj = SizeF.class;
                                break;
                            default:
                                obj = null;
                                break;
                        }
                        if (obj != null) {
                            agkxVar.c(obj);
                        }
                    }
                    agkhVar4.e(str3, agkxVar.g());
                }
                agkhVar3.e(str2, agkhVar4.d(false));
                i = 4;
            }
            Iterator it2 = akcpVar.b.iterator();
            while (it2.hasNext()) {
                ComponentName componentName = new ComponentName(str, (String) it2.next());
                if (akcpVar.d) {
                    agkhVar2.e(componentName, agkhVar3.d(false));
                } else {
                    agkhVar.e(componentName, agkhVar3.d(false));
                }
            }
            i = 4;
        }
        agkj agkjVarD = agkhVar.d(false);
        if (agkjVarD.isEmpty()) {
            this.c = Optional.empty();
        } else {
            this.c = Optional.of(agkjVarD);
        }
        agkj agkjVarD2 = agkhVar2.d(false);
        if (agkjVarD2.isEmpty()) {
            this.d = Optional.empty();
        } else {
            this.d = Optional.of(agkjVarD2);
        }
    }
}
