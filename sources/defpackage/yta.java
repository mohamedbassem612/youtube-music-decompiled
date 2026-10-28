package defpackage;

import android.util.Pair;
import com.google.android.apps.youtube.proto.streaming.BufferedRangeOuterClass$BufferedRange;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yta implements awqg {
    private final /* synthetic */ int $cid;

    public /* synthetic */ yta(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        switch (this.$cid) {
            case 0:
                Integer num = (Integer) obj;
                num.getClass();
                return Boolean.valueOf(num.intValue() != 2);
            case 1:
                BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange = (BufferedRangeOuterClass$BufferedRange) obj;
                bufferedRangeOuterClass$BufferedRange.getClass();
                FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = bufferedRangeOuterClass$BufferedRange.c;
                return formatIdOuterClass$FormatId == null ? FormatIdOuterClass$FormatId.getDefaultInstance() : formatIdOuterClass$FormatId;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                bool.booleanValue();
                return bool;
            case 3:
                wjf wjfVar = ((aayp) obj).a;
                if (wjfVar != null) {
                    return new abef(wjfVar);
                }
                return null;
            case 4:
                wgi wgiVar = ((aazm) obj).b;
                if (wgiVar != null) {
                    return new abeh(wgiVar);
                }
                return null;
            case 5:
                aazq aazqVar = (aazq) obj;
                aazqVar.getClass();
                acip acipVar = aazqVar.b;
                if (acipVar == null) {
                    return avlh.G(abee.a);
                }
                avlh avlhVarG = avlh.G(new abeg(acipVar));
                avlh avlhVarZ = acipVar.Z();
                avlhVarZ.getClass();
                avlh avlhVarH = abek.h(avlhVarZ, new yta(3));
                avlh avlhVarAp = acipVar.ap();
                avlhVarAp.getClass();
                return avlh.J(avlhVarG, avlhVarH, abek.h(avlhVarAp, new yta(4)));
            case 6:
                aazk aazkVar = (aazk) obj;
                Duration duration = abin.a;
                aazkVar.getClass();
                String str = aazkVar.i;
                if (str == null) {
                    str = "";
                }
                return new abim(str, true, aazkVar.g);
            case 7:
                awml awmlVar = (awml) obj;
                Duration duration2 = abin.a;
                awmlVar.getClass();
                return Boolean.valueOf(((abim) awmlVar.a).a.length() > 0 && ((Number) awmlVar.b).longValue() > 0);
            case 8:
                awml awmlVar2 = (awml) obj;
                Duration duration3 = abin.a;
                awmlVar2.getClass();
                return new abik(((abim) awmlVar2.a).a, ((Number) awmlVar2.b).longValue());
            case 9:
                tnw tnwVar = (tnw) obj;
                tnwVar.getClass();
                Object obj2 = tnwVar.a;
                if (obj2 != null) {
                    return Boolean.valueOf(((alyi) obj2).i);
                }
                throw new IllegalStateException("Required value was null.");
            case 10:
                alyi alyiVar = (alyi) obj;
                alyiVar.getClass();
                return Boolean.valueOf(alyiVar.i);
            case 11:
                abul abulVar = (abul) obj;
                abulVar.getClass();
                return Integer.valueOf(abulVar.b);
            case 12:
                abul abulVar2 = (abul) obj;
                abulVar2.getClass();
                Integer num2 = abulVar2.c;
                if (num2 == null) {
                    return -1;
                }
                return num2;
            case 13:
                twu.d(abwx.a, 6, "rxVideoStageEventSink", (Throwable) obj);
                return awmy.a;
            case 14:
                twu.d(abwx.a, 6, "playbackSuspendedEventSink", (Throwable) obj);
                return awmy.a;
            case 15:
                twu.d(abwx.a, 6, "youtubePlayerStateEventSink", (Throwable) obj);
                return awmy.a;
            case 16:
                twu.d(abwx.a, 6, "localVideoTimeEventSink", (Throwable) obj);
                return awmy.a;
            case 17:
                aazq aazqVar2 = (aazq) obj;
                aazqVar2.getClass();
                return aazqVar2.b;
            case 18:
                twu.c(6, "PlayerSettingsEventHandler:Error in handlePlayerSettingControlEvent", (Throwable) obj);
                return awmy.a;
            case 19:
                Pair pair = (Pair) obj;
                pair.getClass();
                return Boolean.valueOf(((aazn) pair.second).a == 2);
            default:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                return (acip) pair2.first;
        }
    }
}
