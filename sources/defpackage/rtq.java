package defpackage;

import android.accounts.Account;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rtq implements avnn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ rtq(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnn
    public final Object a(Object obj) {
        aufd aufdVar;
        switch (this.$cid) {
            case 0:
                return aawb.u(((aazq) obj).b);
            case 1:
                return ((aslf) obj).toByteArray();
            case 2:
                return ((acip) obj).J();
            case 3:
                return ((acip) obj).V();
            case 4:
                return ((aazq) obj).b.ah();
            case 5:
                return ((aazq) obj).b.an();
            case 6:
                return aawb.u(((aazq) obj).b);
            case 7:
                return ((acip) obj).J();
            case 8:
                return aawb.u(((aazq) obj).b);
            case 9:
                return ((acip) obj).G();
            case 10:
                return (Account) ((agev) obj).c();
            case 11:
                return aawb.u(((aazq) obj).b);
            case 12:
                return new aazq((acip) obj);
            case 13:
                return ((weo) obj).c;
            case 14:
                anin aninVar = ((alik) obj).g;
                if (aninVar == null) {
                    aninVar = anin.a;
                }
                ambw ambwVar = aninVar.h;
                return ambwVar == null ? ambw.a : ambwVar;
            case 15:
                return Boolean.valueOf(((tfl) obj).b);
            case 16:
                return Boolean.valueOf(((tfl) obj).c);
            case 17:
                return Integer.valueOf(tzk.t(((Long) obj).longValue(), 74));
            case 18:
                return Optional.of(obj);
            case 19:
                return (apxf) ((Optional) obj).get();
            default:
                Optional optionalOfNullable = (Optional) obj;
                Duration duration = uwa.a;
                boolean z = true;
                if (true == optionalOfNullable.isPresent()) {
                    auhs auhsVar = (auhs) optionalOfNullable.get();
                    aiie aiieVar = auhsVar.g;
                    aiieVar.getClass();
                    if (aiieVar.isEmpty()) {
                        z = false;
                    } else {
                        Iterator<E> it = aiieVar.iterator();
                        do {
                            if (it.hasNext()) {
                                aufdVar = (aufd) it.next();
                                aufdVar.getClass();
                            } else {
                                z = false;
                            }
                        } while (yno.go(aufdVar, auhsVar));
                    }
                    optionalOfNullable = Optional.ofNullable(Boolean.valueOf(z));
                }
                return (Boolean) optionalOfNullable.orElse(Boolean.FALSE);
        }
    }
}
