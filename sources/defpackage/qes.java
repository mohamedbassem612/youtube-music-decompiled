package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import android.util.Base64;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qes extends qnl implements qed, qdy, qfh {
    final AtomicBoolean a;
    public final awmd b;
    public final qfg c;
    public final kjc d;
    public final kjc e;
    private final Context f;
    private final Executor g;
    private final AtomicBoolean h;
    private final qeb i;

    public qes(axfd axfdVar, Context context, kjc kjcVar, qeb qebVar, ahey aheyVar, aunn aunnVar, kjc kjcVar2, awmd awmdVar, awmd awmdVar2, Executor executor) {
        super((short[]) null);
        this.a = new AtomicBoolean();
        new ConcurrentHashMap();
        this.h = new AtomicBoolean(false);
        this.i = qebVar;
        this.c = axfdVar.V(executor, aunnVar, awmdVar2);
        this.f = context;
        this.e = kjcVar;
        this.g = Build.VERSION.SDK_INT < 31 ? executor : aheyVar;
        this.d = kjcVar2;
        this.b = awmdVar;
    }

    private final void bU(final int i) {
        this.g.execute(new ahfo(new ahcx() { // from class: qer
            /* JADX WARN: Code duplicated, block: B:28:0x0092  */
            /* JADX WARN: Code duplicated, block: B:29:0x0095 A[Catch: all -> 0x0c7a, TryCatch #3 {, blocks: (B:8:0x0016, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074, B:11:0x0037), top: B:612:0x0016, inners: #0 }] */
            /* JADX WARN: Code duplicated, block: B:31:0x009b A[Catch: all -> 0x0c7a, TryCatch #3 {, blocks: (B:8:0x0016, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074, B:11:0x0037), top: B:612:0x0016, inners: #0 }] */
            /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
            /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
            /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
            /* JADX WARN: Code duplicated, block: B:38:0x00b1 A[Catch: all -> 0x0c7a, TryCatch #3 {, blocks: (B:8:0x0016, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074, B:11:0x0037), top: B:612:0x0016, inners: #0 }] */
            /* JADX WARN: Code duplicated, block: B:41:0x00bb A[Catch: all -> 0x0c7a, TryCatch #3 {, blocks: (B:8:0x0016, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074, B:11:0x0037), top: B:612:0x0016, inners: #0 }] */
            /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
            /* JADX WARN: Code duplicated, block: B:45:0x00cc A[Catch: all -> 0x0c7a, TryCatch #3 {, blocks: (B:8:0x0016, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074, B:11:0x0037), top: B:612:0x0016, inners: #0 }] */
            /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
            /* JADX WARN: Code duplicated, block: B:49:0x00dd A[Catch: all -> 0x0c7a, TryCatch #3 {, blocks: (B:8:0x0016, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074, B:11:0x0037), top: B:612:0x0016, inners: #0 }] */
            /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
            /* JADX WARN: Code duplicated, block: B:53:0x00ee A[Catch: all -> 0x0c7a, TryCatch #3 {, blocks: (B:8:0x0016, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074, B:11:0x0037), top: B:612:0x0016, inners: #0 }] */
            /* JADX WARN: Code duplicated, block: B:54:0x00f7  */
            /* JADX WARN: Code duplicated, block: B:57:0x00ff A[Catch: all -> 0x0c7a, TryCatch #3 {, blocks: (B:8:0x0016, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074, B:11:0x0037), top: B:612:0x0016, inners: #0 }] */
            /* JADX WARN: Code duplicated, block: B:58:0x0104  */
            /* JADX WARN: Code duplicated, block: B:61:0x010a A[Catch: all -> 0x0c7a, TryCatch #3 {, blocks: (B:8:0x0016, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074, B:11:0x0037), top: B:612:0x0016, inners: #0 }] */
            /* JADX WARN: Code duplicated, block: B:63:0x010e A[Catch: all -> 0x0c7a, TryCatch #3 {, blocks: (B:8:0x0016, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074, B:11:0x0037), top: B:612:0x0016, inners: #0 }] */
            /* JADX WARN: Code duplicated, block: B:65:0x0113  */
            /* JADX WARN: Code duplicated, block: B:68:0x011b A[Catch: all -> 0x0c7a, TryCatch #3 {, blocks: (B:8:0x0016, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074, B:11:0x0037), top: B:612:0x0016, inners: #0 }] */
            /* JADX WARN: Code duplicated, block: B:69:0x0124  */
            /* JADX WARN: Code duplicated, block: B:77:0x0154  */
            /* JADX WARN: Type inference failed for: r0v32, types: [awmd, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v5, types: [awmd, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v44, types: [awmd, java.lang.Object] */
            @Override // defpackage.ahcx
            public final ListenableFuture a() throws IOException {
                boolean zCommit;
                Object objI;
                qjt qjtVar;
                int i2;
                qfa qfaVar;
                axge axgeVar;
                Long lValueOf;
                Long lValueOf2;
                Long lValueOf3;
                Long lValueOf4;
                int i3;
                String str;
                axgh axghVar;
                Integer numValueOf;
                axgh axghVar2;
                int iAX;
                Integer num;
                long j;
                axge axgeVar2;
                Integer num2;
                axgd axgdVar;
                axgd axgdVar2;
                int i4;
                axgd axgdVar3;
                axgd axgdVar4;
                axgd axgdVar5;
                axgd axgdVar6;
                axgd axgdVar7;
                axgd axgdVar8;
                axgd axgdVar9;
                axgd axgdVar10;
                axgd axgdVar11;
                axgd axgdVar12;
                axgd axgdVar13;
                axgd axgdVar14;
                axgd axgdVar15;
                axgd axgdVar16;
                axgd axgdVar17;
                axgd axgdVar18;
                axgd axgdVar19;
                axgd axgdVar20;
                axgd axgdVar21;
                axgd axgdVar22;
                axgd axgdVar23;
                axgd axgdVar24;
                axgd axgdVar25;
                axgd axgdVar26;
                axgd axgdVar27;
                axgd axgdVar28;
                axgd axgdVar29;
                axgd axgdVar30;
                axgd axgdVar31;
                axgd axgdVar32;
                int length;
                qes qesVar = this.a;
                axhz axhzVar = null;
                if (!qesVar.c.b(null)) {
                    return aher.a;
                }
                qpj.b();
                kjc kjcVar = qesVar.d;
                synchronized (kjcVar) {
                    Object obj = kjcVar.a;
                    qjt qjtVar2 = qjt.a;
                    aiix parserForClass = aihn.getParserForClass(qjt.class);
                    qpj.b();
                    zCommit = false;
                    byte[] bArrDecode = !mef.i((Context) ((qiu) obj).a) ? null : Base64.decode(((SharedPreferences) ((qiu) obj).b.io()).getString("primes.battery.snapshot", ""), 0);
                    if (bArrDecode == null || (length = bArrDecode.length) == 0) {
                        objI = null;
                        qjtVar = (qjt) objI;
                        if (qjtVar == null) {
                            qfaVar = null;
                        } else {
                            if ((qjtVar.b & 32) != 0) {
                                iAX = a.aX(qjtVar.h);
                                if (iAX == 0) {
                                    i2 = 1;
                                } else {
                                    i2 = iAX;
                                }
                            } else {
                                i2 = 0;
                            }
                            axgeVar = qjtVar.c;
                            if (axgeVar == null) {
                                axgeVar = axge.a;
                            }
                            axge axgeVar3 = axgeVar;
                            if ((qjtVar.b & 2) != 0) {
                                lValueOf = Long.valueOf(qjtVar.d);
                            } else {
                                lValueOf = null;
                            }
                            if ((qjtVar.b & 4) != 0) {
                                lValueOf2 = Long.valueOf(qjtVar.e);
                            } else {
                                lValueOf2 = null;
                            }
                            if ((qjtVar.b & 8) != 0) {
                                lValueOf3 = Long.valueOf(qjtVar.f);
                            } else {
                                lValueOf3 = null;
                            }
                            if ((qjtVar.b & 16) != 0) {
                                lValueOf4 = Long.valueOf(qjtVar.g);
                            } else {
                                lValueOf4 = null;
                            }
                            i3 = qjtVar.b;
                            if ((i3 & 64) != 0) {
                                str = qjtVar.i;
                            } else {
                                str = null;
                            }
                            if ((i3 & SemanticState.Hidden) != 0) {
                                axghVar2 = qjtVar.j;
                                if (axghVar2 == null) {
                                    axghVar2 = axgh.a;
                                }
                                axghVar = axghVar2;
                            } else {
                                axghVar = null;
                            }
                            if ((qjtVar.b & SemanticState.LiveRegion) != 0) {
                                numValueOf = Integer.valueOf(qjtVar.k);
                            } else {
                                numValueOf = null;
                            }
                            qfaVar = new qfa(axgeVar3, lValueOf, lValueOf2, lValueOf3, lValueOf4, i2, str, axghVar, numValueOf);
                        }
                    } else {
                        if (bArrDecode[0] == 1) {
                            try {
                                objI = parserForClass.i(bArrDecode, 1, length - 1, ExtensionRegistryLite.getGeneratedRegistry());
                            } catch (aiik e) {
                                ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/persistent/PersistentStorage", "readProto", 'Q', "PersistentStorage.java")).t("failure reading proto");
                                objI = null;
                            }
                            qjtVar = (qjt) objI;
                            if (qjtVar == null) {
                                qfaVar = null;
                            } else {
                                if ((qjtVar.b & 32) != 0) {
                                    iAX = a.aX(qjtVar.h);
                                    if (iAX == 0) {
                                        i2 = 1;
                                    } else {
                                        i2 = iAX;
                                    }
                                } else {
                                    i2 = 0;
                                }
                                axgeVar = qjtVar.c;
                                if (axgeVar == null) {
                                    axgeVar = axge.a;
                                }
                                axge axgeVar4 = axgeVar;
                                if ((qjtVar.b & 2) != 0) {
                                    lValueOf = Long.valueOf(qjtVar.d);
                                } else {
                                    lValueOf = null;
                                }
                                if ((qjtVar.b & 4) != 0) {
                                    lValueOf2 = Long.valueOf(qjtVar.e);
                                } else {
                                    lValueOf2 = null;
                                }
                                if ((qjtVar.b & 8) != 0) {
                                    lValueOf3 = Long.valueOf(qjtVar.f);
                                } else {
                                    lValueOf3 = null;
                                }
                                if ((qjtVar.b & 16) != 0) {
                                    lValueOf4 = Long.valueOf(qjtVar.g);
                                } else {
                                    lValueOf4 = null;
                                }
                                i3 = qjtVar.b;
                                if ((i3 & 64) != 0) {
                                    str = qjtVar.i;
                                } else {
                                    str = null;
                                }
                                if ((i3 & SemanticState.Hidden) != 0) {
                                    axghVar2 = qjtVar.j;
                                    if (axghVar2 == null) {
                                        axghVar2 = axgh.a;
                                    }
                                    axghVar = axghVar2;
                                } else {
                                    axghVar = null;
                                }
                                if ((qjtVar.b & SemanticState.LiveRegion) != 0) {
                                    numValueOf = Integer.valueOf(qjtVar.k);
                                } else {
                                    numValueOf = null;
                                }
                                qfaVar = new qfa(axgeVar4, lValueOf, lValueOf2, lValueOf3, lValueOf4, i2, str, axghVar, numValueOf);
                            }
                        } else {
                            ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/persistent/PersistentStorage", "readProto", 84, "PersistentStorage.java")).t("wrong header");
                        }
                        objI = null;
                        qjtVar = (qjt) objI;
                        if (qjtVar == null) {
                            qfaVar = null;
                        } else {
                            if ((qjtVar.b & 32) != 0) {
                                iAX = a.aX(qjtVar.h);
                                if (iAX == 0) {
                                    i2 = 1;
                                } else {
                                    i2 = iAX;
                                }
                            } else {
                                i2 = 0;
                            }
                            axgeVar = qjtVar.c;
                            if (axgeVar == null) {
                                axgeVar = axge.a;
                            }
                            axge axgeVar5 = axgeVar;
                            if ((qjtVar.b & 2) != 0) {
                                lValueOf = Long.valueOf(qjtVar.d);
                            } else {
                                lValueOf = null;
                            }
                            if ((qjtVar.b & 4) != 0) {
                                lValueOf2 = Long.valueOf(qjtVar.e);
                            } else {
                                lValueOf2 = null;
                            }
                            if ((qjtVar.b & 8) != 0) {
                                lValueOf3 = Long.valueOf(qjtVar.f);
                            } else {
                                lValueOf3 = null;
                            }
                            if ((qjtVar.b & 16) != 0) {
                                lValueOf4 = Long.valueOf(qjtVar.g);
                            } else {
                                lValueOf4 = null;
                            }
                            i3 = qjtVar.b;
                            if ((i3 & 64) != 0) {
                                str = qjtVar.i;
                            } else {
                                str = null;
                            }
                            if ((i3 & SemanticState.Hidden) != 0) {
                                axghVar2 = qjtVar.j;
                                if (axghVar2 == null) {
                                    axghVar2 = axgh.a;
                                }
                                axghVar = axghVar2;
                            } else {
                                axghVar = null;
                            }
                            if ((qjtVar.b & SemanticState.LiveRegion) != 0) {
                                numValueOf = Integer.valueOf(qjtVar.k);
                            } else {
                                numValueOf = null;
                            }
                            qfaVar = new qfa(axgeVar5, lValueOf, lValueOf2, lValueOf3, lValueOf4, i2, str, axghVar, numValueOf);
                        }
                    }
                    throw th;
                }
                qep qepVar = (qep) qesVar.b.io();
                awmd awmdVar = qepVar.c;
                if (((qeq) awmdVar.io()).d()) {
                    int intProperty = qepVar.a().getIntProperty(1);
                    Integer numValueOf2 = Integer.valueOf(intProperty);
                    numValueOf2.getClass();
                    if (intProperty >= 0) {
                        num = numValueOf2;
                    } else {
                        num = null;
                    }
                } else {
                    num = null;
                }
                mbc mbcVar = qepVar.a;
                Long lValueOf5 = Long.valueOf(mbcVar.b());
                Long lValueOf6 = Long.valueOf(mbcVar.f().toEpochMilli());
                SystemHealthManager systemHealthManagerM825m = ie$$ExternalSyntheticApiModelOutline0.m825m(((Context) qepVar.d.a).getSystemService("systemhealth"));
                HealthStats healthStatsTakeMyUidSnapshot = systemHealthManagerM825m != null ? systemHealthManagerM825m.takeMyUidSnapshot() : null;
                int i5 = i;
                qfa qfaVarE = qnl.E(lValueOf5, lValueOf6, healthStatsTakeMyUidSnapshot, num, qepVar, i5);
                kjc kjcVar2 = qesVar.d;
                synchronized (kjcVar2) {
                    aihf aihfVarCreateBuilder = qjt.a.createBuilder();
                    axge axgeVar6 = qfaVarE.a;
                    if (axgeVar6 != null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        qjt qjtVar3 = (qjt) aihfVarCreateBuilder.instance;
                        qjtVar3.c = axgeVar6;
                        qjtVar3.b |= 1;
                    }
                    Long l = qfaVarE.b;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        aihfVarCreateBuilder.copyOnWrite();
                        qjt qjtVar4 = (qjt) aihfVarCreateBuilder.instance;
                        qjtVar4.b |= 2;
                        qjtVar4.d = jLongValue;
                    }
                    Long l2 = qfaVarE.c;
                    if (l2 != null) {
                        long jLongValue2 = l2.longValue();
                        aihfVarCreateBuilder.copyOnWrite();
                        qjt qjtVar5 = (qjt) aihfVarCreateBuilder.instance;
                        qjtVar5.b |= 4;
                        qjtVar5.e = jLongValue2;
                    }
                    Long l3 = qfaVarE.d;
                    if (l3 != null) {
                        long jLongValue3 = l3.longValue();
                        aihfVarCreateBuilder.copyOnWrite();
                        qjt qjtVar6 = (qjt) aihfVarCreateBuilder.instance;
                        qjtVar6.b |= 8;
                        qjtVar6.f = jLongValue3;
                    }
                    Long l4 = qfaVarE.e;
                    if (l4 != null) {
                        long jLongValue4 = l4.longValue();
                        aihfVarCreateBuilder.copyOnWrite();
                        qjt qjtVar7 = (qjt) aihfVarCreateBuilder.instance;
                        qjtVar7.b |= 16;
                        qjtVar7.g = jLongValue4;
                    }
                    int i6 = qfaVarE.i;
                    if (i6 != 0) {
                        aihfVarCreateBuilder.copyOnWrite();
                        qjt qjtVar8 = (qjt) aihfVarCreateBuilder.instance;
                        qjtVar8.b |= 32;
                        qjtVar8.h = i6 - 1;
                    }
                    String str2 = qfaVarE.f;
                    if (str2 != null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        qjt qjtVar9 = (qjt) aihfVarCreateBuilder.instance;
                        qjtVar9.b |= 64;
                        qjtVar9.i = str2;
                    }
                    axgh axghVar3 = qfaVarE.g;
                    if (axghVar3 != null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        qjt qjtVar10 = (qjt) aihfVarCreateBuilder.instance;
                        qjtVar10.j = axghVar3;
                        qjtVar10.b |= SemanticState.Hidden;
                    }
                    Integer num3 = qfaVarE.h;
                    if (num3 != null) {
                        int iIntValue = num3.intValue();
                        aihfVarCreateBuilder.copyOnWrite();
                        qjt qjtVar11 = (qjt) aihfVarCreateBuilder.instance;
                        qjtVar11.b |= SemanticState.LiveRegion;
                        qjtVar11.k = iIntValue;
                    }
                    Object obj2 = kjcVar2.a;
                    qjt qjtVar12 = (qjt) aihfVarCreateBuilder.build();
                    qjtVar12.getClass();
                    byte[] byteArray = qjtVar12.toByteArray();
                    qpj.b();
                    if (mef.i((Context) ((qiu) obj2).a)) {
                        int length2 = byteArray.length;
                        byte[] bArr = new byte[length2 + 1];
                        bArr[0] = 1;
                        System.arraycopy(byteArray, 0, bArr, 1, length2);
                        zCommit = ((SharedPreferences) ((qiu) obj2).b.io()).edit().putString("primes.battery.snapshot", Base64.encodeToString(bArr, 0)).commit();
                    }
                }
                if (!zCommit) {
                    qesVar.e.F(qesVar);
                    kjc kjcVar3 = qesVar.d;
                    synchronized (kjcVar3) {
                        Object obj3 = kjcVar3.a;
                        qpj.b();
                        if (mef.i((Context) ((qiu) obj3).a)) {
                            ((SharedPreferences) ((qiu) obj3).b.io()).edit().remove("primes.battery.snapshot").commit();
                        }
                    }
                    throw new IOException("Failure storing persistent snapshot and helper data");
                }
                qep qepVar2 = (qep) qesVar.b.io();
                if (qfaVar != null && qep.b(qfaVar, qfaVarE)) {
                    oml omlVar = qepVar2.d;
                    axge axgeVar7 = qfaVarE.a;
                    axge axgeVar8 = qfaVar.a;
                    if (axgeVar7 == null || axgeVar8 == null) {
                        j = 0;
                    } else {
                        fxg fxgVar = (fxg) axge.a.createBuilder();
                        if ((axgeVar7.b & 1) != 0) {
                            long j2 = axgeVar7.d - axgeVar8.d;
                            if (j2 != 0) {
                                fxgVar.copyOnWrite();
                                axge axgeVar9 = (axge) fxgVar.instance;
                                axgeVar9.b |= 1;
                                axgeVar9.d = j2;
                            }
                        }
                        if ((axgeVar7.b & 2) != 0) {
                            long j3 = axgeVar7.e - axgeVar8.e;
                            if (j3 != 0) {
                                fxgVar.copyOnWrite();
                                axge axgeVar10 = (axge) fxgVar.instance;
                                axgeVar10.b |= 2;
                                axgeVar10.e = j3;
                            }
                        }
                        if ((axgeVar7.b & 4) != 0) {
                            long j4 = axgeVar7.f - axgeVar8.f;
                            if (j4 != 0) {
                                fxgVar.copyOnWrite();
                                axge axgeVar11 = (axge) fxgVar.instance;
                                axgeVar11.b |= 4;
                                axgeVar11.f = j4;
                            }
                        }
                        if ((axgeVar7.b & 8) != 0) {
                            long j5 = axgeVar7.g - axgeVar8.g;
                            if (j5 != 0) {
                                fxgVar.copyOnWrite();
                                axge axgeVar12 = (axge) fxgVar.instance;
                                axgeVar12.b |= 8;
                                axgeVar12.g = j5;
                            }
                        }
                        qez qezVar = qez.a;
                        fxgVar.q(qezVar.f(axgeVar7.h, axgeVar8.h));
                        fxgVar.r(qez.a.f(axgeVar7.i, axgeVar8.i));
                        fxgVar.s(qez.a.f(axgeVar7.j, axgeVar8.j));
                        fxgVar.p(qez.a.f(axgeVar7.k, axgeVar8.k));
                        fxgVar.o(qez.a.f(axgeVar7.l, axgeVar8.l));
                        fxgVar.k(qez.a.f(axgeVar7.m, axgeVar8.m));
                        if ((axgeVar7.b & 16) != 0) {
                            axgdVar = axgeVar7.n;
                            if (axgdVar == null) {
                                axgdVar = axgd.a;
                            }
                        } else {
                            axgdVar = null;
                        }
                        if ((axgeVar8.b & 16) != 0) {
                            axgdVar2 = axgeVar8.n;
                            if (axgdVar2 == null) {
                                axgdVar2 = axgd.a;
                            }
                        } else {
                            axgdVar2 = null;
                        }
                        axgd axgdVarX = qnl.x(axgdVar, axgdVar2);
                        if (axgdVarX != null) {
                            fxgVar.copyOnWrite();
                            axge axgeVar13 = (axge) fxgVar.instance;
                            axgeVar13.n = axgdVarX;
                            axgeVar13.b |= 16;
                        }
                        fxgVar.l(qezVar.f(axgeVar7.o, axgeVar8.o));
                        fxgVar.n(qew.a.f(axgeVar7.q, axgeVar8.q));
                        fxgVar.m(qev.a.f(axgeVar7.r, axgeVar8.r));
                        if ((axgeVar7.b & 32) != 0) {
                            long j6 = axgeVar7.s - axgeVar8.s;
                            if (j6 != 0) {
                                fxgVar.copyOnWrite();
                                axge axgeVar14 = (axge) fxgVar.instance;
                                axgeVar14.b |= 32;
                                axgeVar14.s = j6;
                            }
                        }
                        if ((axgeVar7.b & 64) != 0) {
                            long j7 = axgeVar7.t - axgeVar8.t;
                            if (j7 != 0) {
                                fxgVar.copyOnWrite();
                                axge axgeVar15 = (axge) fxgVar.instance;
                                axgeVar15.b |= 64;
                                axgeVar15.t = j7;
                            }
                        }
                        if ((axgeVar7.b & SemanticState.Focused) != 0) {
                            long j8 = axgeVar7.u - axgeVar8.u;
                            if (j8 != 0) {
                                fxgVar.copyOnWrite();
                                axge axgeVar16 = (axge) fxgVar.instance;
                                axgeVar16.b |= SemanticState.Focused;
                                axgeVar16.u = j8;
                            }
                        }
                        if ((axgeVar7.b & SemanticState.Hidden) != 0) {
                            long j9 = axgeVar7.v - axgeVar8.v;
                            if (j9 != 0) {
                                fxgVar.copyOnWrite();
                                axge axgeVar17 = (axge) fxgVar.instance;
                                axgeVar17.b |= SemanticState.Hidden;
                                axgeVar17.v = j9;
                            }
                        }
                        if ((axgeVar7.b & SemanticState.LiveRegion) != 0) {
                            long j10 = axgeVar7.w - axgeVar8.w;
                            if (j10 != 0) {
                                fxgVar.copyOnWrite();
                                axge axgeVar18 = (axge) fxgVar.instance;
                                axgeVar18.b |= SemanticState.LiveRegion;
                                axgeVar18.w = j10;
                            }
                        }
                        if ((axgeVar7.b & SemanticState.ReadOnly) != 0) {
                            long j11 = axgeVar7.x - axgeVar8.x;
                            if (j11 != 0) {
                                fxgVar.copyOnWrite();
                                axge axgeVar19 = (axge) fxgVar.instance;
                                axgeVar19.b |= SemanticState.ReadOnly;
                                axgeVar19.x = j11;
                            }
                        }
                        if ((axgeVar7.b & SemanticState.Modal) != 0) {
                            long j12 = axgeVar7.y - axgeVar8.y;
                            if (j12 != 0) {
                                fxgVar.copyOnWrite();
                                axge axgeVar20 = (axge) fxgVar.instance;
                                axgeVar20.b |= SemanticState.Modal;
                                axgeVar20.y = j12;
                            }
                        }
                        if ((axgeVar7.b & SemanticState.Obscured) != 0) {
                            long j13 = axgeVar7.z - axgeVar8.z;
                            if (j13 != 0) {
                                fxgVar.copyOnWrite();
                                axge axgeVar21 = (axge) fxgVar.instance;
                                axgeVar21.b |= SemanticState.Obscured;
                                axgeVar21.z = j13;
                            }
                        }
                        if ((axgeVar7.b & SemanticState.Multiline) != 0) {
                            long j14 = axgeVar7.A - axgeVar8.A;
                            if (j14 != 0) {
                                fxgVar.copyOnWrite();
                                axge axgeVar22 = (axge) fxgVar.instance;
                                axgeVar22.b |= SemanticState.Multiline;
                                axgeVar22.A = j14;
                            }
                        }
                        if ((axgeVar7.b & 16384) != 0) {
                            long j15 = axgeVar7.B - axgeVar8.B;
                            if (j15 != 0) {
                                fxgVar.copyOnWrite();
                                axge axgeVar23 = (axge) fxgVar.instance;
                                axgeVar23.b |= 16384;
                                axgeVar23.B = j15;
                            }
                        }
                        if ((axgeVar7.b & 32768) != 0) {
                            j = 0;
                            long j16 = axgeVar7.C - axgeVar8.C;
                            if (j16 != 0) {
                                fxgVar.copyOnWrite();
                                axge axgeVar24 = (axge) fxgVar.instance;
                                axgeVar24.b |= 32768;
                                axgeVar24.C = j16;
                            }
                        } else {
                            j = 0;
                        }
                        if ((axgeVar7.b & 65536) != 0) {
                            long j17 = axgeVar7.D - axgeVar8.D;
                            if (j17 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar25 = (axge) fxgVar.instance;
                                axgeVar25.b |= 65536;
                                axgeVar25.D = j17;
                            }
                        }
                        if ((axgeVar7.b & 131072) != 0) {
                            i4 = 32768;
                            long j18 = axgeVar7.E - axgeVar8.E;
                            if (j18 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar26 = (axge) fxgVar.instance;
                                axgeVar26.b |= 131072;
                                axgeVar26.E = j18;
                            }
                        } else {
                            i4 = 32768;
                        }
                        if ((axgeVar7.b & 262144) != 0) {
                            long j19 = axgeVar7.F - axgeVar8.F;
                            if (j19 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar27 = (axge) fxgVar.instance;
                                axgeVar27.b |= 262144;
                                axgeVar27.F = j19;
                            }
                        }
                        if ((axgeVar7.b & 524288) != 0) {
                            axgdVar3 = axgeVar7.G;
                            if (axgdVar3 == null) {
                                axgdVar3 = axgd.a;
                            }
                        } else {
                            axgdVar3 = null;
                        }
                        if ((axgeVar8.b & 524288) != 0) {
                            axgdVar4 = axgeVar8.G;
                            if (axgdVar4 == null) {
                                axgdVar4 = axgd.a;
                            }
                        } else {
                            axgdVar4 = null;
                        }
                        axgd axgdVarX2 = qnl.x(axgdVar3, axgdVar4);
                        if (axgdVarX2 != null) {
                            fxgVar.copyOnWrite();
                            axge axgeVar28 = (axge) fxgVar.instance;
                            axgeVar28.G = axgdVarX2;
                            axgeVar28.b |= 524288;
                        }
                        if ((axgeVar7.b & 1048576) != 0) {
                            long j20 = axgeVar7.H - axgeVar8.H;
                            if (j20 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar29 = (axge) fxgVar.instance;
                                axgeVar29.b |= 1048576;
                                axgeVar29.H = j20;
                            }
                        }
                        if ((axgeVar7.b & 2097152) != 0) {
                            axgdVar5 = axgeVar7.I;
                            if (axgdVar5 == null) {
                                axgdVar5 = axgd.a;
                            }
                        } else {
                            axgdVar5 = null;
                        }
                        if ((axgeVar8.b & 2097152) != 0) {
                            axgdVar6 = axgeVar8.I;
                            if (axgdVar6 == null) {
                                axgdVar6 = axgd.a;
                            }
                        } else {
                            axgdVar6 = null;
                        }
                        axgd axgdVarX3 = qnl.x(axgdVar5, axgdVar6);
                        if (axgdVarX3 != null) {
                            fxgVar.copyOnWrite();
                            axge axgeVar30 = (axge) fxgVar.instance;
                            axgeVar30.I = axgdVarX3;
                            axgeVar30.b |= 2097152;
                        }
                        if ((axgeVar7.b & 4194304) != 0) {
                            axgdVar7 = axgeVar7.J;
                            if (axgdVar7 == null) {
                                axgdVar7 = axgd.a;
                            }
                        } else {
                            axgdVar7 = null;
                        }
                        if ((axgeVar8.b & 4194304) != 0) {
                            axgdVar8 = axgeVar8.J;
                            if (axgdVar8 == null) {
                                axgdVar8 = axgd.a;
                            }
                        } else {
                            axgdVar8 = null;
                        }
                        axgd axgdVarX4 = qnl.x(axgdVar7, axgdVar8);
                        if (axgdVarX4 != null) {
                            fxgVar.copyOnWrite();
                            axge axgeVar31 = (axge) fxgVar.instance;
                            axgeVar31.J = axgdVarX4;
                            axgeVar31.b |= 4194304;
                        }
                        if ((axgeVar7.b & 8388608) != 0) {
                            axgdVar9 = axgeVar7.K;
                            if (axgdVar9 == null) {
                                axgdVar9 = axgd.a;
                            }
                        } else {
                            axgdVar9 = null;
                        }
                        if ((axgeVar8.b & 8388608) != 0) {
                            axgdVar10 = axgeVar8.K;
                            if (axgdVar10 == null) {
                                axgdVar10 = axgd.a;
                            }
                        } else {
                            axgdVar10 = null;
                        }
                        axgd axgdVarX5 = qnl.x(axgdVar9, axgdVar10);
                        if (axgdVarX5 != null) {
                            fxgVar.copyOnWrite();
                            axge axgeVar32 = (axge) fxgVar.instance;
                            axgeVar32.K = axgdVarX5;
                            axgeVar32.b |= 8388608;
                        }
                        if ((axgeVar7.b & 16777216) != 0) {
                            axgdVar11 = axgeVar7.L;
                            if (axgdVar11 == null) {
                                axgdVar11 = axgd.a;
                            }
                        } else {
                            axgdVar11 = null;
                        }
                        if ((axgeVar8.b & 16777216) != 0) {
                            axgdVar12 = axgeVar8.L;
                            if (axgdVar12 == null) {
                                axgdVar12 = axgd.a;
                            }
                        } else {
                            axgdVar12 = null;
                        }
                        axgd axgdVarX6 = qnl.x(axgdVar11, axgdVar12);
                        if (axgdVarX6 != null) {
                            fxgVar.copyOnWrite();
                            axge axgeVar33 = (axge) fxgVar.instance;
                            axgeVar33.L = axgdVarX6;
                            axgeVar33.b |= 16777216;
                        }
                        if ((axgeVar7.b & 33554432) != 0) {
                            axgdVar13 = axgeVar7.M;
                            if (axgdVar13 == null) {
                                axgdVar13 = axgd.a;
                            }
                        } else {
                            axgdVar13 = null;
                        }
                        if ((axgeVar8.b & 33554432) != 0) {
                            axgdVar14 = axgeVar8.M;
                            if (axgdVar14 == null) {
                                axgdVar14 = axgd.a;
                            }
                        } else {
                            axgdVar14 = null;
                        }
                        axgd axgdVarX7 = qnl.x(axgdVar13, axgdVar14);
                        if (axgdVarX7 != null) {
                            fxgVar.copyOnWrite();
                            axge axgeVar34 = (axge) fxgVar.instance;
                            axgeVar34.M = axgdVarX7;
                            axgeVar34.b |= 33554432;
                        }
                        if ((axgeVar7.b & 67108864) != 0) {
                            axgdVar15 = axgeVar7.N;
                            if (axgdVar15 == null) {
                                axgdVar15 = axgd.a;
                            }
                        } else {
                            axgdVar15 = null;
                        }
                        if ((axgeVar8.b & 67108864) != 0) {
                            axgdVar16 = axgeVar8.N;
                            if (axgdVar16 == null) {
                                axgdVar16 = axgd.a;
                            }
                        } else {
                            axgdVar16 = null;
                        }
                        axgd axgdVarX8 = qnl.x(axgdVar15, axgdVar16);
                        if (axgdVarX8 != null) {
                            fxgVar.copyOnWrite();
                            axge axgeVar35 = (axge) fxgVar.instance;
                            axgeVar35.N = axgdVarX8;
                            axgeVar35.b |= 67108864;
                        }
                        if ((axgeVar7.b & 134217728) != 0) {
                            axgdVar17 = axgeVar7.O;
                            if (axgdVar17 == null) {
                                axgdVar17 = axgd.a;
                            }
                        } else {
                            axgdVar17 = null;
                        }
                        if ((axgeVar8.b & 134217728) != 0) {
                            axgdVar18 = axgeVar8.O;
                            if (axgdVar18 == null) {
                                axgdVar18 = axgd.a;
                            }
                        } else {
                            axgdVar18 = null;
                        }
                        axgd axgdVarX9 = qnl.x(axgdVar17, axgdVar18);
                        if (axgdVarX9 != null) {
                            fxgVar.copyOnWrite();
                            axge axgeVar36 = (axge) fxgVar.instance;
                            axgeVar36.O = axgdVarX9;
                            axgeVar36.b |= 134217728;
                        }
                        if ((axgeVar7.b & 268435456) != 0) {
                            axgdVar19 = axgeVar7.P;
                            if (axgdVar19 == null) {
                                axgdVar19 = axgd.a;
                            }
                        } else {
                            axgdVar19 = null;
                        }
                        if ((axgeVar8.b & 268435456) != 0) {
                            axgdVar20 = axgeVar8.P;
                            if (axgdVar20 == null) {
                                axgdVar20 = axgd.a;
                            }
                        } else {
                            axgdVar20 = null;
                        }
                        axgd axgdVarX10 = qnl.x(axgdVar19, axgdVar20);
                        if (axgdVarX10 != null) {
                            fxgVar.copyOnWrite();
                            axge axgeVar37 = (axge) fxgVar.instance;
                            axgeVar37.P = axgdVarX10;
                            axgeVar37.b |= 268435456;
                        }
                        if ((axgeVar7.b & 536870912) != 0) {
                            axgdVar21 = axgeVar7.Q;
                            if (axgdVar21 == null) {
                                axgdVar21 = axgd.a;
                            }
                        } else {
                            axgdVar21 = null;
                        }
                        if ((axgeVar8.b & 536870912) != 0) {
                            axgdVar22 = axgeVar8.Q;
                            if (axgdVar22 == null) {
                                axgdVar22 = axgd.a;
                            }
                        } else {
                            axgdVar22 = null;
                        }
                        axgd axgdVarX11 = qnl.x(axgdVar21, axgdVar22);
                        if (axgdVarX11 != null) {
                            fxgVar.copyOnWrite();
                            axge axgeVar38 = (axge) fxgVar.instance;
                            axgeVar38.Q = axgdVarX11;
                            axgeVar38.b |= 536870912;
                        }
                        if ((axgeVar7.b & 1073741824) != 0) {
                            axgdVar23 = axgeVar7.R;
                            if (axgdVar23 == null) {
                                axgdVar23 = axgd.a;
                            }
                        } else {
                            axgdVar23 = null;
                        }
                        if ((axgeVar8.b & 1073741824) != 0) {
                            axgdVar24 = axgeVar8.R;
                            if (axgdVar24 == null) {
                                axgdVar24 = axgd.a;
                            }
                        } else {
                            axgdVar24 = null;
                        }
                        axgd axgdVarX12 = qnl.x(axgdVar23, axgdVar24);
                        if (axgdVarX12 != null) {
                            fxgVar.copyOnWrite();
                            axge axgeVar39 = (axge) fxgVar.instance;
                            axgeVar39.R = axgdVarX12;
                            axgeVar39.b |= 1073741824;
                        }
                        if ((axgeVar7.b & Integer.MIN_VALUE) != 0) {
                            axgdVar25 = axgeVar7.S;
                            if (axgdVar25 == null) {
                                axgdVar25 = axgd.a;
                            }
                        } else {
                            axgdVar25 = null;
                        }
                        if ((axgeVar8.b & Integer.MIN_VALUE) != 0) {
                            axgdVar26 = axgeVar8.S;
                            if (axgdVar26 == null) {
                                axgdVar26 = axgd.a;
                            }
                        } else {
                            axgdVar26 = null;
                        }
                        axgd axgdVarX13 = qnl.x(axgdVar25, axgdVar26);
                        if (axgdVarX13 != null) {
                            fxgVar.copyOnWrite();
                            axge axgeVar40 = (axge) fxgVar.instance;
                            axgeVar40.S = axgdVarX13;
                            axgeVar40.b |= Integer.MIN_VALUE;
                        }
                        if ((axgeVar7.c & 1) != 0) {
                            axgdVar27 = axgeVar7.T;
                            if (axgdVar27 == null) {
                                axgdVar27 = axgd.a;
                            }
                        } else {
                            axgdVar27 = null;
                        }
                        if ((axgeVar8.c & 1) != 0) {
                            axgdVar28 = axgeVar8.T;
                            if (axgdVar28 == null) {
                                axgdVar28 = axgd.a;
                            }
                        } else {
                            axgdVar28 = null;
                        }
                        axgd axgdVarX14 = qnl.x(axgdVar27, axgdVar28);
                        if (axgdVarX14 != null) {
                            fxgVar.copyOnWrite();
                            axge axgeVar41 = (axge) fxgVar.instance;
                            axgeVar41.T = axgdVarX14;
                            axgeVar41.c |= 1;
                        }
                        if ((axgeVar7.c & 2) != 0) {
                            axgdVar29 = axgeVar7.U;
                            if (axgdVar29 == null) {
                                axgdVar29 = axgd.a;
                            }
                        } else {
                            axgdVar29 = null;
                        }
                        if ((axgeVar8.c & 2) != 0) {
                            axgdVar30 = axgeVar8.U;
                            if (axgdVar30 == null) {
                                axgdVar30 = axgd.a;
                            }
                        } else {
                            axgdVar30 = null;
                        }
                        axgd axgdVarX15 = qnl.x(axgdVar29, axgdVar30);
                        if (axgdVarX15 != null) {
                            fxgVar.copyOnWrite();
                            axge axgeVar42 = (axge) fxgVar.instance;
                            axgeVar42.U = axgdVarX15;
                            axgeVar42.c |= 2;
                        }
                        if ((axgeVar7.c & 4) != 0) {
                            long j21 = axgeVar7.V - axgeVar8.V;
                            if (j21 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar43 = (axge) fxgVar.instance;
                                axgeVar43.c |= 4;
                                axgeVar43.V = j21;
                            }
                        }
                        if ((axgeVar7.c & 8) != 0) {
                            long j22 = axgeVar7.W - axgeVar8.W;
                            if (j22 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar44 = (axge) fxgVar.instance;
                                axgeVar44.c |= 8;
                                axgeVar44.W = j22;
                            }
                        }
                        if ((axgeVar7.c & 16) != 0) {
                            long j23 = axgeVar7.X - axgeVar8.X;
                            if (j23 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar45 = (axge) fxgVar.instance;
                                axgeVar45.c |= 16;
                                axgeVar45.X = j23;
                            }
                        }
                        if ((axgeVar7.c & 32) != 0) {
                            long j24 = axgeVar7.Y - axgeVar8.Y;
                            if (j24 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar46 = (axge) fxgVar.instance;
                                axgeVar46.c |= 32;
                                axgeVar46.Y = j24;
                            }
                        }
                        if ((axgeVar7.c & 64) != 0) {
                            long j25 = axgeVar7.Z - axgeVar8.Z;
                            if (j25 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar47 = (axge) fxgVar.instance;
                                axgeVar47.c |= 64;
                                axgeVar47.Z = j25;
                            }
                        }
                        if ((axgeVar7.c & SemanticState.Focused) != 0) {
                            long j26 = axgeVar7.aa - axgeVar8.aa;
                            if (j26 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar48 = (axge) fxgVar.instance;
                                axgeVar48.c |= SemanticState.Focused;
                                axgeVar48.aa = j26;
                            }
                        }
                        if ((axgeVar7.c & SemanticState.Hidden) != 0) {
                            long j27 = axgeVar7.ab - axgeVar8.ab;
                            if (j27 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar49 = (axge) fxgVar.instance;
                                axgeVar49.c |= SemanticState.Hidden;
                                axgeVar49.ab = j27;
                            }
                        }
                        if ((axgeVar7.c & SemanticState.LiveRegion) != 0) {
                            long j28 = axgeVar7.ac - axgeVar8.ac;
                            if (j28 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar50 = (axge) fxgVar.instance;
                                axgeVar50.c |= SemanticState.LiveRegion;
                                axgeVar50.ac = j28;
                            }
                        }
                        if ((axgeVar7.c & SemanticState.ReadOnly) != 0) {
                            long j29 = axgeVar7.ad - axgeVar8.ad;
                            if (j29 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar51 = (axge) fxgVar.instance;
                                axgeVar51.c |= SemanticState.ReadOnly;
                                axgeVar51.ad = j29;
                            }
                        }
                        if ((axgeVar7.c & SemanticState.Modal) != 0) {
                            long j30 = axgeVar7.ae - axgeVar8.ae;
                            if (j30 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar52 = (axge) fxgVar.instance;
                                axgeVar52.c |= SemanticState.Modal;
                                axgeVar52.ae = j30;
                            }
                        }
                        if ((axgeVar7.c & SemanticState.Obscured) != 0) {
                            long j31 = axgeVar7.af - axgeVar8.af;
                            if (j31 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar53 = (axge) fxgVar.instance;
                                axgeVar53.c |= SemanticState.Obscured;
                                axgeVar53.af = j31;
                            }
                        }
                        if ((axgeVar7.c & SemanticState.Multiline) != 0) {
                            long j32 = axgeVar7.ag - axgeVar8.ag;
                            if (j32 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar54 = (axge) fxgVar.instance;
                                axgeVar54.c |= SemanticState.Multiline;
                                axgeVar54.ag = j32;
                            }
                        }
                        if ((axgeVar7.c & 16384) != 0) {
                            long j33 = axgeVar7.ah - axgeVar8.ah;
                            if (j33 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar55 = (axge) fxgVar.instance;
                                axgeVar55.c |= 16384;
                                axgeVar55.ah = j33;
                            }
                        }
                        if ((axgeVar7.c & i4) != 0) {
                            long j34 = axgeVar7.ai - axgeVar8.ai;
                            if (j34 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar56 = (axge) fxgVar.instance;
                                axgeVar56.c |= i4;
                                axgeVar56.ai = j34;
                            }
                        }
                        if ((axgeVar7.c & 65536) != 0) {
                            long j35 = axgeVar7.aj - axgeVar8.aj;
                            if (j35 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar57 = (axge) fxgVar.instance;
                                axgeVar57.c |= 65536;
                                axgeVar57.aj = j35;
                            }
                        }
                        if ((axgeVar7.c & 131072) != 0) {
                            axgdVar31 = axgeVar7.ak;
                            if (axgdVar31 == null) {
                                axgdVar31 = axgd.a;
                            }
                        } else {
                            axgdVar31 = null;
                        }
                        if ((axgeVar8.c & 131072) != 0) {
                            axgdVar32 = axgeVar8.ak;
                            if (axgdVar32 == null) {
                                axgdVar32 = axgd.a;
                            }
                        } else {
                            axgdVar32 = null;
                        }
                        axgd axgdVarX16 = qnl.x(axgdVar31, axgdVar32);
                        if (axgdVarX16 != null) {
                            fxgVar.copyOnWrite();
                            axge axgeVar58 = (axge) fxgVar.instance;
                            axgeVar58.ak = axgdVarX16;
                            axgeVar58.c |= 131072;
                        }
                        if ((axgeVar7.c & 262144) != 0) {
                            long j36 = axgeVar7.al - axgeVar8.al;
                            if (j36 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar59 = (axge) fxgVar.instance;
                                axgeVar59.c |= 262144;
                                axgeVar59.al = j36;
                            }
                        }
                        if ((axgeVar7.c & 524288) != 0) {
                            long j37 = axgeVar7.am - axgeVar8.am;
                            if (j37 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar60 = (axge) fxgVar.instance;
                                axgeVar60.c |= 524288;
                                axgeVar60.am = j37;
                            }
                        }
                        if ((axgeVar7.c & 1048576) != 0) {
                            long j38 = axgeVar7.an - axgeVar8.an;
                            if (j38 != j) {
                                fxgVar.copyOnWrite();
                                axge axgeVar61 = (axge) fxgVar.instance;
                                axgeVar61.c |= 1048576;
                                axgeVar61.an = j38;
                            }
                        }
                        axgeVar7 = (axge) fxgVar.build();
                        if (qnl.C(axgeVar7)) {
                            axgeVar7 = null;
                        }
                    }
                    if (axgeVar7 == null) {
                        axgeVar2 = null;
                    } else {
                        fxg fxgVar2 = (fxg) axgeVar7.toBuilder();
                        qnl.D(fxgVar2, (qet) omlVar.b);
                        axgeVar2 = (axge) fxgVar2.build();
                    }
                    if (axgeVar2 != null && (axgeVar2.b & 1) != 0 && axgeVar2.d > j) {
                        aihf aihfVarCreateBuilder2 = axfv.a.createBuilder();
                        Long l5 = qfaVarE.b;
                        l5.getClass();
                        Long l6 = qfaVar.b;
                        long jLongValue5 = l5.longValue();
                        l6.getClass();
                        long jLongValue6 = jLongValue5 - l6.longValue();
                        aihfVarCreateBuilder2.copyOnWrite();
                        axfv axfvVar = (axfv) aihfVarCreateBuilder2.instance;
                        axfvVar.b |= 64;
                        axfvVar.i = jLongValue6;
                        int i7 = qfaVar.i;
                        if (i7 != 0) {
                            aihfVarCreateBuilder2.copyOnWrite();
                            axfv axfvVar2 = (axfv) aihfVarCreateBuilder2.instance;
                            axfvVar2.c = i7 - 1;
                            axfvVar2.b |= 1;
                        }
                        String str3 = qfaVar.f;
                        if (str3 != null) {
                            aihfVarCreateBuilder2.copyOnWrite();
                            axfv axfvVar3 = (axfv) aihfVarCreateBuilder2.instance;
                            axfvVar3.b |= 8;
                            axfvVar3.f = str3;
                        }
                        axgh axghVar4 = qfaVar.g;
                        if (axghVar4 != null) {
                            aihfVarCreateBuilder2.copyOnWrite();
                            axfv axfvVar4 = (axfv) aihfVarCreateBuilder2.instance;
                            axfvVar4.g = axghVar4;
                            axfvVar4.b |= 16;
                        }
                        int i8 = qfaVarE.i;
                        if (i8 != 0) {
                            aihfVarCreateBuilder2.copyOnWrite();
                            axfv axfvVar5 = (axfv) aihfVarCreateBuilder2.instance;
                            axfvVar5.h = i8 - 1;
                            axfvVar5.b |= 32;
                        }
                        if (l5 != null) {
                            long jLongValue7 = l5.longValue();
                            aihfVarCreateBuilder2.copyOnWrite();
                            axfv axfvVar6 = (axfv) aihfVarCreateBuilder2.instance;
                            axfvVar6.b |= SemanticState.Hidden;
                            axfvVar6.k = jLongValue7;
                        }
                        Integer num4 = qfaVar.h;
                        if (num4 != null && (num2 = qfaVarE.h) != null) {
                            int iIntValue2 = num2.intValue() - num4.intValue();
                            aihfVarCreateBuilder2.copyOnWrite();
                            axfv axfvVar7 = (axfv) aihfVarCreateBuilder2.instance;
                            axfvVar7.b |= SemanticState.LiveRegion;
                            axfvVar7.l = iIntValue2;
                        }
                        aihfVarCreateBuilder2.copyOnWrite();
                        axfv axfvVar8 = (axfv) aihfVarCreateBuilder2.instance;
                        axfvVar8.j = axgeVar2;
                        axfvVar8.b |= SemanticState.Focused;
                        aihf aihfVarCreateBuilder3 = axhz.a.createBuilder();
                        aihf aihfVarCreateBuilder4 = axfw.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        axfw axfwVar = (axfw) aihfVarCreateBuilder4.instance;
                        axfv axfvVar9 = (axfv) aihfVarCreateBuilder2.build();
                        axfvVar9.getClass();
                        axfwVar.c = axfvVar9;
                        axfwVar.b |= 1;
                        aihfVarCreateBuilder3.copyOnWrite();
                        axhz axhzVar2 = (axhz) aihfVarCreateBuilder3.instance;
                        axfw axfwVar2 = (axfw) aihfVarCreateBuilder4.build();
                        axfwVar2.getClass();
                        axhzVar2.j = axfwVar2;
                        axhzVar2.b |= SemanticState.Hidden;
                        axhzVar = (axhz) aihfVarCreateBuilder3.build();
                    }
                }
                if (axhzVar == null) {
                    return aher.a;
                }
                qfg qfgVar = qesVar.c;
                String str4 = qfaVarE.f;
                qfc qfcVarA = qfd.a();
                qfcVarA.b(str4);
                qfcVarA.d(true);
                qfcVarA.g(axhzVar);
                qfcVarA.h(qfaVarE.g);
                return qfgVar.a(qfcVarA.a());
            }
        }));
    }

    @Override // defpackage.qdy
    public final void g(qci qciVar) {
        if (!mef.i(this.f)) {
            ListenableFuture listenableFuture = aher.a;
            return;
        }
        try {
            ahno.O(this.a.getAndSet(false));
            bU(2);
        } catch (Exception e) {
            ahng.m(e);
        }
    }

    @Override // defpackage.qed
    public final void h() {
        if (this.h.getAndSet(true)) {
            return;
        }
        j(null);
    }

    @Override // defpackage.qdy
    public final void j(qci qciVar) {
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean.get()) {
            return;
        }
        if (!mef.h(this.f)) {
            ListenableFuture listenableFuture = aher.a;
        } else if (!atomicBoolean.getAndSet(true)) {
            bU(3);
        } else {
            ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl", "onAppToForeground", 140, "BatteryMetricServiceImpl.java")).t("App is already in the foreground.");
            ahng.l();
        }
    }

    @Override // defpackage.qfh
    public final void k() {
        this.i.a(this);
        this.e.E(this);
    }

    @Override // defpackage.qed
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void f(int i) {
    }
}
