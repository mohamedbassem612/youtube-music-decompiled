package defpackage;

import android.service.notification.StatusBarNotification;
import j$.time.Duration;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rit implements Comparator {
    private final /* synthetic */ int $cid;

    public /* synthetic */ rit(int i) {
        this.$cid = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iIntValue;
        int iIntValue2;
        switch (this.$cid) {
            case 0:
                return Float.compare(((Float) obj).floatValue(), ((Float) obj2).floatValue());
            case 1:
                return atqq.f(Long.valueOf(((aiec) obj).j), Long.valueOf(((aiec) obj2).j));
            case 2:
                int i = rjo.a;
                return ((qvq) obj).p.compareTo(((qvq) obj2).p);
            case 3:
                iIntValue = ((aivk) obj).d;
                iIntValue2 = ((aivk) obj2).d;
                break;
            case 4:
                aigu aiguVar = ((augy) obj).i;
                if (aiguVar == null) {
                    aiguVar = aigu.a;
                }
                aiguVar.getClass();
                Duration durationV = aext.v(aiguVar);
                aigu aiguVar2 = ((augy) obj2).i;
                if (aiguVar2 == null) {
                    aiguVar2 = aigu.a;
                }
                aiguVar2.getClass();
                return atqq.f(durationV, aext.v(aiguVar2));
            case 5:
                throw null;
            case 6:
                int i2 = xnp.h;
                return ((atpb) ((Map.Entry) obj).getValue()).e < ((atpb) ((Map.Entry) obj2).getValue()).e ? 1 : -1;
            case 7:
                return ((dii) obj).e.compareTo(((dii) obj2).e);
            case 8:
                int i3 = zoy.a;
                iIntValue = ((Integer) obj).intValue();
                iIntValue2 = ((Integer) obj2).intValue();
                break;
            case 9:
                return (int) (((StatusBarNotification) obj).getPostTime() - ((StatusBarNotification) obj2).getPostTime());
            case 10:
                return ((aach) obj).b.compareTo(((aach) obj2).b);
            case 11:
                return ((Long) ((Map.Entry) obj2).getValue()).compareTo((Long) ((Map.Entry) obj).getValue());
            case 12:
                iIntValue = ((Integer) obj).intValue();
                iIntValue2 = ((Integer) obj2).intValue();
                break;
            case 13:
                iIntValue = ((acca) obj).i;
                iIntValue2 = ((acca) obj2).i;
                break;
            case 14:
                acck acckVar = (acck) obj;
                acck acckVar2 = (acck) obj2;
                int i4 = acckVar.a;
                int i5 = acckVar2.a;
                return i4 != i5 ? Integer.compare(i4, i5) : Integer.compare(acckVar.b, acckVar2.b);
            case 15:
                aqmg aqmgVar = (aqmg) obj;
                aqmg aqmgVar2 = (aqmg) obj2;
                return Integer.compare(aqmgVar2.d * aqmgVar2.e, aqmgVar.d * aqmgVar.e);
            case 16:
                return atqq.f(Integer.valueOf(((admv) obj).a), Integer.valueOf(((admv) obj2).a));
            case 17:
                return Long.compare(aaj$$ExternalSyntheticApiModelOutline0.m(obj).getTimestamp(), aaj$$ExternalSyntheticApiModelOutline0.m(obj2).getTimestamp());
            case 18:
                return Long.compare(((axmq) obj).a, ((axmq) obj2).a);
            default:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
        }
        return iIntValue - iIntValue2;
    }
}
