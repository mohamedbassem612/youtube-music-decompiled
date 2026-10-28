package defpackage;

import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avdp extends aveh {
    final /* synthetic */ avds a;
    final /* synthetic */ auym b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avdp(avds avdsVar, auym auymVar) {
        super(avdsVar.b.f);
        this.b = auymVar;
        this.a = avdsVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a A[Catch: IOException -> 0x00d7, all -> 0x00de, TryCatch #1 {IOException -> 0x00d7, blocks: (B:14:0x0034, B:16:0x003a, B:20:0x0044, B:22:0x004e, B:24:0x0056, B:29:0x0066, B:31:0x006f, B:33:0x0073, B:34:0x0078, B:35:0x0098, B:26:0x0059, B:37:0x009b), top: B:66:0x0034, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009b A[Catch: IOException -> 0x00d7, all -> 0x00de, TRY_LEAVE, TryCatch #1 {IOException -> 0x00d7, blocks: (B:14:0x0034, B:16:0x003a, B:20:0x0044, B:22:0x004e, B:24:0x0056, B:29:0x0066, B:31:0x006f, B:33:0x0073, B:34:0x0078, B:35:0x0098, B:26:0x0059, B:37:0x009b), top: B:66:0x0034, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0 A[DONT_INVERT, PHI: r6
      0x00a0: PHI (r6v1 aigm) = (r6v0 aigm), (r6v0 aigm), (r6v7 aigm) binds: [B:15:0x0038, B:36:0x0099, B:33:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:66:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.aveh
    public final void a() {
        aigm aigmVarN;
        Object objF;
        int iAvailable;
        byte[] bArr;
        int i = avky.a;
        avds avdsVar = this.a;
        avdt avdtVar = avdsVar.b;
        if (avdsVar.a != null) {
            avfp.h(this.b);
            return;
        }
        while (true) {
            try {
                InputStream inputStreamB = this.b.b();
                if (inputStreamB == null) {
                    return;
                }
                try {
                    atxy atxyVar = avdsVar.c;
                    avbf avbfVar = avdtVar.c.d;
                    if (inputStreamB instanceof avkj) {
                        avkj avkjVar = (avkj) inputStreamB;
                        if (avkjVar.b == ((avkk) avbfVar).b) {
                            try {
                                objF = avkjVar.a;
                                if (objF == null) {
                                    throw new IllegalStateException("message not available");
                                }
                            } catch (IllegalStateException unused) {
                                try {
                                    aigmVarN = null;
                                    if (inputStreamB instanceof avaf) {
                                        iAvailable = inputStreamB.available();
                                        if (iAvailable <= 0) {
                                            if (iAvailable == 0) {
                                                objF = ((avkk) avbfVar).c;
                                            } else {
                                                if (aigmVarN == null) {
                                                    aigmVarN = aigm.N(inputStreamB, SemanticState.Obscured);
                                                }
                                                aigmVarN.j = Alert.DURATION_SHOW_INDEFINITELY;
                                                objF = ((avkk) avbfVar).b.f(aigmVarN, avkl.a);
                                                aigmVarN.z(0);
                                            }
                                        } else if (iAvailable == 0) {
                                            objF = ((avkk) avbfVar).c;
                                        } else {
                                            if (aigmVarN == null) {
                                                aigmVarN = aigm.N(inputStreamB, SemanticState.Obscured);
                                            }
                                            aigmVarN.j = Alert.DURATION_SHOW_INDEFINITELY;
                                            objF = ((avkk) avbfVar).b.f(aigmVarN, avkl.a);
                                            aigmVarN.z(0);
                                        }
                                    } else {
                                        if (aigmVarN == null) {
                                            aigmVarN = aigm.N(inputStreamB, SemanticState.Obscured);
                                        }
                                        aigmVarN.j = Alert.DURATION_SHOW_INDEFINITELY;
                                        try {
                                            objF = ((avkk) avbfVar).b.f(aigmVarN, avkl.a);
                                            try {
                                                aigmVarN.z(0);
                                            } catch (aiik e) {
                                                throw e;
                                            }
                                        } catch (aiik e2) {
                                            throw new avcg(Status.l.withDescription("Invalid protobuf byte sequence").c(e2));
                                        }
                                    }
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3);
                                }
                            }
                        } else {
                            aigmVarN = null;
                            if (inputStreamB instanceof avaf) {
                                if (aigmVarN == null) {
                                    aigmVarN = aigm.N(inputStreamB, SemanticState.Obscured);
                                }
                                aigmVarN.j = Alert.DURATION_SHOW_INDEFINITELY;
                                objF = ((avkk) avbfVar).b.f(aigmVarN, avkl.a);
                                aigmVarN.z(0);
                            } else {
                                iAvailable = inputStreamB.available();
                                if (iAvailable <= 0 && iAvailable <= 4194304) {
                                    ThreadLocal threadLocal = avkk.a;
                                    Reference reference = (Reference) threadLocal.get();
                                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                                        bArr = new byte[iAvailable];
                                        threadLocal.set(new WeakReference(bArr));
                                    }
                                    int i2 = iAvailable;
                                    while (i2 > 0) {
                                        int i3 = inputStreamB.read(bArr, iAvailable - i2, i2);
                                        if (i3 == -1) {
                                            break;
                                        } else {
                                            i2 -= i3;
                                        }
                                    }
                                    if (i2 != 0) {
                                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i2));
                                    }
                                    aigmVarN = aigm.O(bArr, 0, iAvailable, false);
                                } else if (iAvailable == 0) {
                                    objF = ((avkk) avbfVar).c;
                                }
                                if (aigmVarN == null) {
                                    aigmVarN = aigm.N(inputStreamB, SemanticState.Obscured);
                                }
                                aigmVarN.j = Alert.DURATION_SHOW_INDEFINITELY;
                                objF = ((avkk) avbfVar).b.f(aigmVarN, avkl.a);
                                aigmVarN.z(0);
                            }
                        }
                    } else {
                        aigmVarN = null;
                        if (inputStreamB instanceof avaf) {
                            if (aigmVarN == null) {
                                aigmVarN = aigm.N(inputStreamB, SemanticState.Obscured);
                            }
                            aigmVarN.j = Alert.DURATION_SHOW_INDEFINITELY;
                            objF = ((avkk) avbfVar).b.f(aigmVarN, avkl.a);
                            aigmVarN.z(0);
                        } else {
                            iAvailable = inputStreamB.available();
                            if (iAvailable <= 0) {
                                if (iAvailable == 0) {
                                    objF = ((avkk) avbfVar).c;
                                } else {
                                    if (aigmVarN == null) {
                                        aigmVarN = aigm.N(inputStreamB, SemanticState.Obscured);
                                    }
                                    aigmVarN.j = Alert.DURATION_SHOW_INDEFINITELY;
                                    objF = ((avkk) avbfVar).b.f(aigmVarN, avkl.a);
                                    aigmVarN.z(0);
                                }
                            } else if (iAvailable == 0) {
                                objF = ((avkk) avbfVar).c;
                            } else {
                                if (aigmVarN == null) {
                                    aigmVarN = aigm.N(inputStreamB, SemanticState.Obscured);
                                }
                                aigmVarN.j = Alert.DURATION_SHOW_INDEFINITELY;
                                objF = ((avkk) avbfVar).b.f(aigmVarN, avkl.a);
                                aigmVarN.z(0);
                            }
                        }
                    }
                    atxyVar.s(objF);
                    inputStreamB.close();
                } catch (Throwable th) {
                    avfp.e(inputStreamB);
                    throw th;
                }
            } catch (Throwable th2) {
                avfp.h(this.b);
                this.a.b(Status.b.c(th2).withDescription("Failed to read message."));
                return;
            }
        }
    }
}
