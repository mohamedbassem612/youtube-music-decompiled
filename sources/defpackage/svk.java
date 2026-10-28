package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import com.google.android.gms.wallet.firstparty.ExitResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class svk implements sxt {
    public final svj a;
    final /* synthetic */ svl b;
    private final aigj c;
    private final String d;
    private final aroq e;

    public svk(svl svlVar, aigj aigjVar, String str, aroq aroqVar, svj svjVar) {
        this.b = svlVar;
        this.c = aigjVar;
        this.d = str;
        this.e = aroqVar;
        this.a = svjVar;
    }

    @Override // defpackage.sxt
    public final boolean d(int i, int i2, Intent intent) {
        ExitResult exitResult;
        String str;
        String str2;
        Bundle bundleExtra;
        if (i != 906) {
            return false;
        }
        acb acbVar = new acb((char[]) null);
        acbVar.c = i2 == -1 ? "Successful payment" : a.bR(i2, "Received payment result callback with resultCode: ");
        aigj aigjVar = this.c;
        if (!aigjVar.E()) {
            acbVar.d = aigjVar;
        }
        svl svlVar = this.b;
        xeu xeuVar = svlVar.f;
        boolean z = xeuVar.b;
        if (z) {
            xff xffVarA = xeuVar.a(acbVar.o(), alot.TRANSACTION_FLOW_PAYMENT_CALL_BACK_RECEIVED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } else {
            xeuVar.b(acbVar.i());
        }
        if (i2 == -1) {
            acb acbVar2 = new acb((char[]) null);
            if (!aigjVar.E()) {
                acbVar2.d = aigjVar;
            }
            if (z) {
                xff xffVarA2 = xeuVar.a(acbVar2.o(), alot.TRANSACTION_FLOW_PAYMENT_SUCCEEDED);
                ztf ztfVar2 = xffVarA2.k.e;
                xffVarA2.l = ztfVar2.a();
                ztfVar2.k(xffVarA2);
            } else {
                xeuVar.b(acbVar2.j());
            }
            String str3 = this.d;
            if (TextUtils.isEmpty(str3)) {
                this.a.c(intent);
            } else if (intent == null) {
                intent = null;
                this.a.c(intent);
            } else if (!TextUtils.isEmpty(str3)) {
                wby wbyVarE = svlVar.c.e(svlVar.b.e());
                aihf aihfVarCreateBuilder = akae.a.createBuilder();
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
                if (byteArrayExtra != null) {
                    String strJ = agyg.d.j(byteArrayExtra);
                    aihfVarCreateBuilder.copyOnWrite();
                    akae akaeVar = (akae) aihfVarCreateBuilder.instance;
                    akaeVar.b |= 1;
                    akaeVar.c = strJ;
                }
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_CALLBACK_DATA_TOKEN");
                if (byteArrayExtra2 != null) {
                    String strJ2 = agyg.d.j(byteArrayExtra2);
                    aihfVarCreateBuilder.copyOnWrite();
                    akae akaeVar2 = (akae) aihfVarCreateBuilder.instance;
                    akaeVar2.b |= 2;
                    akaeVar2.d = strJ2;
                }
                byte[] byteArrayExtra3 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_SERVER_ANALYTICS_TOKEN");
                if (byteArrayExtra3 != null) {
                    aigj aigjVarV = aigj.v(byteArrayExtra3);
                    aihfVarCreateBuilder.copyOnWrite();
                    akae akaeVar3 = (akae) aihfVarCreateBuilder.instance;
                    aigjVarV.getClass();
                    akaeVar3.b |= 4;
                    akaeVar3.e = aigjVarV;
                }
                ajzx ajzxVarE = ajzz.e(str3);
                aihf aihfVarCreateBuilder2 = akad.a.createBuilder();
                akae akaeVar4 = (akae) aihfVarCreateBuilder.build();
                aihfVarCreateBuilder2.copyOnWrite();
                akad akadVar = (akad) aihfVarCreateBuilder2.instance;
                akaeVar4.getClass();
                akadVar.c = akaeVar4;
                akadVar.b = 3;
                ajzxVarE.am((akad) aihfVarCreateBuilder2.build());
                ajzz ajzzVarAn = ajzxVarE.an();
                wer werVarE = wbyVarE.e();
                werVarE.e(ajzzVarAn);
                werVarE.b().r(svlVar.g).j(new hmg(this, intent, 10, null)).D();
            }
        } else if (i2 != 0) {
            acb acbVar3 = new acb((char[]) null);
            acbVar3.d = aigjVar;
            acbVar3.a = 5;
            if (z) {
                xff xffVarA3 = xeuVar.a(acbVar3.o(), alot.TRANSACTION_FLOW_FAILED);
                ztf ztfVar3 = xffVarA3.k.e;
                xffVarA3.l = ztfVar3.a();
                ztfVar3.k(xffVarA3);
            } else {
                xeuVar.b(acbVar3.h());
            }
            aroq aroqVar = this.e;
            if (aroqVar != null) {
                if (intent == null || (bundleExtra = intent.getBundleExtra("com.google.android.gms.wallet.firstparty.EXTRA_EXIT_RESULT_BUNDLE")) == null) {
                    exitResult = null;
                } else {
                    exitResult = new ExitResult();
                    exitResult.a = bundleExtra.getInt("paymentsExitCode", 402);
                    exitResult.b = bundleExtra.getString("debugMessage", "");
                    exitResult.c = bundleExtra.getInt("playBillingExitCode", 0);
                    exitResult.d = bundleExtra.getInt("apiErrorReason");
                }
                if (exitResult != null) {
                    String str4 = "Payments Exit Code: " + exitResult.a;
                    str2 = exitResult.b;
                    str = str4;
                } else {
                    str = "";
                    str2 = str;
                }
                nsh.e(svlVar.h, aroqVar, 11, 3, str, str2);
            }
            if (i2 == 1) {
                svlVar.c(this.a, new Error(svlVar.e.getResources().getString(R.string.payment_wallet_processing_error)));
            } else {
                svlVar.c(this.a, null);
            }
            zvp.a(zvn.a, zvm.l, "youtubePayment::GpayController ".concat(a.bR(i2, "WalletAPI error result with resultCode: ")));
        } else {
            this.a.a();
            acb acbVar4 = new acb((char[]) null);
            acbVar4.c = "Payment Result";
            if (!aigjVar.E()) {
                acbVar4.d = aigjVar;
            }
            if (z) {
                xff xffVarA4 = xeuVar.a(acbVar4.o(), alot.TRANSACTION_FLOW_CANCELLED);
                ztf ztfVar4 = xffVarA4.k.e;
                xffVarA4.l = ztfVar4.a();
                ztfVar4.k(xffVarA4);
            } else {
                xeuVar.b(acbVar4.g());
            }
        }
        return true;
    }
}
