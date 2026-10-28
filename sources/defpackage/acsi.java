package defpackage;

import com.google.cardboard.sdk.R;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acsi extends awrb implements awqk {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acsi(Object obj, int i) {
        super(2, obj, acsj.class, "reduce", "reduce(Lcom/google/android/libraries/youtube/reel/internal/player/ReelCaptionOnMuteController$CaptionMuteState;Lcom/google/android/libraries/youtube/reel/internal/player/ReelCaptionOnMuteController$Event;)Lcom/google/android/libraries/youtube/reel/internal/player/ReelCaptionOnMuteController$CaptionMuteState;", 0);
        this.$cid = i;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return dms.a((dmq) this.receiver, (awqg) obj, (awoq) obj2);
        }
        acsd acsdVar = (acsd) obj;
        acsh acshVar = (acsh) obj2;
        acsdVar.getClass();
        acshVar.getClass();
        acsd acsdVarA = acsd.a(acsdVar, false, false, null, 0, false, false, null, 79);
        Objects.checkIndex(0, 4);
        if (acshVar instanceof acse) {
            boolean z = ((acse) acshVar).a;
            if (z != acsdVarA.a) {
                acsd acsdVarA2 = acsd.a(acsdVarA, z, false, null, 0, false, false, null, R.styleable.AppCompatTheme_windowNoTitle);
                if (acsdVarA.g != 3) {
                    boolean zA = acsj.a(acsdVarA.f);
                    if (z) {
                        if (!zA) {
                            return acsd.a(acsdVarA2, false, true, null, 0, true, false, null, 109);
                        }
                    } else if (acsdVarA.b) {
                        return acsd.a(acsdVarA2, false, false, null, 0, false, true, null, 93);
                    }
                }
                return acsdVarA2;
            }
        } else if (acshVar instanceof acsg) {
            String str = ((acsg) acshVar).a;
            if (!awrc.c(acsdVarA.c, str)) {
                acsdVarA = acsd.a(acsdVarA, false, false, str, 0, false, false, null, 123);
                if (acsdVarA.g != 3) {
                    acsdVarA = acsd.a(acsdVarA, false, false, null, 1, false, false, null, 119);
                }
            }
            if (acsdVarA.b && acsdVarA.g == 1) {
                return acsdVarA.a ? acsd.a(acsdVarA, false, false, null, 2, true, false, null, 103) : acsd.a(acsdVarA, false, false, null, 2, false, false, null, 119);
            }
        } else {
            if (!(acshVar instanceof acsf)) {
                throw new awmj();
            }
            aazb aazbVar = ((acsf) acshVar).a;
            acsdVarA = acsd.a(acsdVarA, false, false, null, 0, false, false, aazbVar.b, 63);
            if (aazbVar.d == 1) {
                return acsd.a(acsdVarA, false, false, null, 3, false, false, null, 117);
            }
        }
        return acsdVarA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acsi(Object obj, int i, byte[] bArr) {
        super(2, obj, dms.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        this.$cid = i;
    }
}
