package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgc implements nwg {
    private final /* synthetic */ int $cid;
    public final Object a;

    public mgc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public static void e(View view) {
        InputMethodManager inputMethodManager;
        if (view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override // defpackage.nrx
    public final aigw a() {
        switch (this.$cid) {
            case 0:
                return asqq.b;
            case 1:
                return asqo.b;
            case 2:
                return assk.b;
            case 3:
                return akma.b;
            case 4:
                return akmc.b;
            case 5:
                return asox.b;
            case 6:
                return akmb.b;
            default:
                return ajfk.b;
        }
    }

    @Override // defpackage.nrx
    public final aslz b() {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }
        return a.r();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, nsr] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, mfy] */
    @Override // defpackage.nwg
    public final /* synthetic */ avlb c(Object obj, nwf nwfVar) {
        switch (this.$cid) {
            case 0:
                final asqq asqqVar = (asqq) obj;
                if ((asqqVar.c & 1) != 0) {
                    asqp asqpVar = asqqVar.d;
                    if (asqpVar == null) {
                        asqpVar = asqp.a;
                    }
                    if ((asqpVar.c == 1 ? (String) asqpVar.d : "").length() > 0) {
                        final ClipboardManager clipboardManager = (ClipboardManager) ((Context) this.a).getSystemService("clipboard");
                        return clipboardManager == null ? avlb.e() : avlb.o(new Runnable() { // from class: mgb
                            /* JADX WARN: Code duplicated, block: B:23:0x003b  */
                            /* JADX WARN: Code duplicated, block: B:25:0x003f  */
                            /* JADX WARN: Code duplicated, block: B:28:0x0045  */
                            @Override // java.lang.Runnable
                            public final void run() {
                                asqp asqpVar2;
                                ClipData clipDataNewPlainText;
                                asqq asqqVar2 = asqqVar;
                                asqp asqpVar3 = asqqVar2.d;
                                if (asqpVar3 == null) {
                                    asqpVar3 = asqp.a;
                                }
                                if ((asqpVar3.b & 1) == 0) {
                                    asqpVar2 = asqqVar2.d;
                                    if (asqpVar2 == null) {
                                        asqpVar2 = asqp.a;
                                    }
                                    clipDataNewPlainText = ClipData.newPlainText(null, asqpVar2.c == 1 ? (String) asqpVar2.d : "");
                                } else {
                                    asqp asqpVar4 = asqqVar2.d;
                                    if (asqpVar4 == null) {
                                        asqpVar4 = asqp.a;
                                    }
                                    if (asqpVar4.e.isEmpty()) {
                                        asqpVar2 = asqqVar2.d;
                                        if (asqpVar2 == null) {
                                            asqpVar2 = asqp.a;
                                        }
                                        clipDataNewPlainText = ClipData.newPlainText(null, asqpVar2.c == 1 ? (String) asqpVar2.d : "");
                                    } else {
                                        asqp asqpVar5 = asqqVar2.d;
                                        asqp asqpVar6 = asqpVar5 == null ? asqp.a : asqpVar5;
                                        String str = asqpVar6.c == 1 ? (String) asqpVar6.d : "";
                                        if (asqpVar5 == null) {
                                            asqpVar5 = asqp.a;
                                        }
                                        clipDataNewPlainText = ClipData.newHtmlText("", str, asqpVar5.e);
                                    }
                                }
                                clipboardManager.setPrimaryClip(clipDataNewPlainText);
                            }
                        }).v(avmh.a());
                    }
                }
                return avlb.e();
            case 1:
                return avlb.o(new mga(this, 0)).v(avmh.a());
            case 2:
                Object obj2 = this.a;
                obj2.getClass();
                return avlb.n(new hoi(obj2, 5)).v(avmh.a());
            case 3:
                Object obj3 = this.a;
                obj3.getClass();
                return avlb.n(new hoi(obj3, 7)).v(avmh.a());
            case 4:
                Object obj4 = this.a;
                obj4.getClass();
                return avlb.n(new hoi(obj4, 8)).v(avmh.a());
            case 5:
                asox asoxVar = (asox) obj;
                return this.a.a(asoxVar.c).an(agdf.a).c(new hpn(this, asoxVar, 6));
            case 6:
                Looper looperMyLooper = Looper.myLooper();
                Looper mainLooper = Looper.getMainLooper();
                ?? r2 = this.a;
                if (looperMyLooper == mainLooper) {
                    r2.a();
                    return avlb.e();
                }
                r2.getClass();
                return avlb.n(new hoi(r2, 20)).v(avmh.a());
            default:
                return avlb.n(new hmg(this, (ajfk) obj, 19));
        }
    }

    @Override // defpackage.nwg
    public final /* synthetic */ avlb d(mew mewVar, nwf nwfVar) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }
        return nrb.a(this, mewVar, nwfVar);
    }

    public mgc(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
