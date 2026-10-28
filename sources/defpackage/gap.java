package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import app.rive.semantics.SemanticState;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gap extends gam {
    private static ayq A = null;
    private static dov B = null;
    protected static final Object s = new Object();
    static boolean t = false;
    private static long w;
    private static gat x;
    private static gbn y;
    private static gbh z;
    gbm u;
    protected final ahsm v;

    protected gap(Context context, ahsm ahsmVar) {
        super(context);
        new HashMap();
        this.v = ahsmVar;
    }

    protected static gbg n(Context context, boolean z2) {
        if (a == null) {
            synchronized (s) {
                if (a == null) {
                    dov dovVar = B;
                    gbg gbgVar = new gbg(context);
                    try {
                        gbgVar.b = Executors.newCachedThreadPool(new ktb(1));
                        gbgVar.g = z2;
                        if (z2) {
                            gbgVar.b.submit(new dxk(gbgVar, 9, null));
                        }
                        gbgVar.b.execute(new fsu(gbgVar, 4));
                        try {
                            klu kluVar = klu.d;
                            Context context2 = gbgVar.a;
                            kml.a(context2);
                            gbgVar.k = kluVar.l(context2) == 0;
                        } catch (Throwable unused) {
                        }
                        if (dovVar != null) {
                            gbgVar.n = dovVar;
                        } else {
                            gbgVar.f(0);
                        }
                        char[] cArr = gbj.a;
                        if (a.x() && ((Boolean) jwp.s.d()).booleanValue()) {
                            throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
                        }
                        gbgVar.d = new gav();
                        try {
                            try {
                                byte[] bArrAW = kro.aW("DlfhmUc5EDWB9Yuofamr6rb1jQ31CNE1tKNgFRZNWSs=");
                                if (bArrAW.length != 32) {
                                    throw new gau();
                                }
                                byte[] bArr = new byte[16];
                                ByteBuffer.wrap(bArrAW, 4, 16).get(bArr);
                                for (int i = 0; i < 16; i++) {
                                    bArr[i] = (byte) (bArr[i] ^ 68);
                                }
                                gbgVar.e = bArr;
                                try {
                                    Context context3 = gbgVar.a;
                                    File cacheDir = context3.getCacheDir();
                                    if (cacheDir == null && (cacheDir = context3.getDir("dex", 0)) == null) {
                                        throw new gbb();
                                    }
                                    File file = new File(String.format("%s/%s.jar", cacheDir, "1787936389793"));
                                    if (!file.exists()) {
                                        byte[] bArrB = gbgVar.d.b(gbgVar.e, "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");
                                        file.createNewFile();
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            file.setReadOnly();
                                        }
                                        fileOutputStream.write(bArrB, 0, bArrB.length);
                                        fileOutputStream.close();
                                    }
                                    gbgVar.g(cacheDir);
                                    try {
                                        try {
                                            gbgVar.c = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, context3.getClassLoader());
                                            gbg.e(file);
                                            gbgVar.i(cacheDir);
                                            gbg.e(new File(String.format("%s/%s.dex", cacheDir, "1787936389793")));
                                            gbgVar.j = new gak(gbgVar);
                                            gbgVar.l = true;
                                            if (gbgVar.l) {
                                                try {
                                                    if (((Boolean) jwp.r.d()).booleanValue()) {
                                                        gbgVar.h("UF05MvNjw8EW8jh459JtVDelUNkOJ4vFb/Yon5Dcu5fCv2exrnOlNK3KtsaBLp+p", "8iUHpT52FaqVzaWGOZCCUEUhTG+h5qESO1sO2eFzqQY=", new Class[0]);
                                                    }
                                                } catch (IllegalStateException unused2) {
                                                }
                                                gbgVar.h("3EkKBY34IotfrE9ctJjKODb19qi4bI716v1tJbCIEAIsFr2RsSc7dl8YtlCkordC", "OKAZTYC7CeZ51fUioUYQ0fho/+MTmzjtFD6cGoT7oVA=", Context.class);
                                                if (((Boolean) jwp.u.d()).booleanValue()) {
                                                    gbgVar.h("5B458X0v4/KuTee7HSD6J48NfkPiGS44SuWDwWFKaldPm1qeiI+pd/cizEdJZ8+t", "BrJ5MiXjCuzm1ntfq3y6gqgS49CGP9+CAe+livJqYF4=", new Class[0]);
                                                }
                                                gbgVar.h("ovPc3T/5VNpmA+0oXh63zHYLo4ZMQbnpcqhblofkZgwJFS2pcgg2Bx2KuOvr4t4y", "WFNyUjQYUEiy0O1vWb+ZGO6heO91FiW7jakAv4LCbas=", Context.class);
                                                gbgVar.h("cXzUdzxKtIyji4oAmpSjOYTQ3anLJ3eo/8xUl9XwGDh45bgvLwQ83uH3LY+YcmTJ", "ma9IuiJAqmU0vJcLG+v6NkuHqnizjljXOQYoaA01iC0=", Context.class);
                                                gbgVar.h("M9yico5AANfu4aZ1TdrlczENIG33WgpklxK+mTW4HOlB0oGDYaRPp2kRAmmSgams", "C9rrIWuRFVmVu9oTQXt/sPIUl+/6M07ySvGK7JmM73Y=", Context.class);
                                                gbgVar.h("L2+Onoldi+9yXtL0GSDq44O30y1HXGu7c43ZFvmHTExSiuGSa1HmDeMmeZBAhlSh", "6ROGmQSzuQIVfFazSGe+sz4U8NIaimvhIuETAyd7RP8=", Context.class);
                                                gbgVar.h("dyWP/GotGQ50CtnuUccpMloulQGKCs5xVHjd33wdC8zZadAnyFM4isgzL1zVO0RY", "q9NroT+VB8UNCM638RFtokd2xAaNlSDTXsPFtklSztg=", Context.class, Boolean.TYPE);
                                                gbgVar.h("gCM0ED7pciDuY5xbx3ebwyPQpCNldX/bP76OrYRLdtMzjq7DoqyMtd+9mfzGQwJU", "TuSE3TZdW7axB5d4rWooHDZaw1BR4+Mttob/0paLt1I=", Context.class);
                                                gbgVar.h("QA7zVYavovZ2AEzQyRQiGwEQUcwsVlOx5OO6/35YPAs6pFVOgxk0TwEnQaKMcSO6", "aZeKeu7f+oV5IqidcZvLxJS9j27lggYHaH2Nx3dcwu4=", Context.class);
                                                gbgVar.h("4ovyjT/fdRMgrOvUBLYORg7+XTaOp5PyBwRhA0+bP/RuVEP+BXj95dKE/KAkUNap", "rPDVSoK35dQ4QDChybIT3Db/a26BR81F9UAqLx0Za4s=", MotionEvent.class, DisplayMetrics.class);
                                                gbgVar.h("GuqxRBsJS/+OvCTLDr1B95LWVXdtVdNQnafVtgGYhcISvoc5fJW1gkuZ//YinBfq", "UiuMHhJ1mbDz7OKuvBCjrkbDs0dRozC2X1qswd5tPbY=", MotionEvent.class, DisplayMetrics.class);
                                                gbgVar.h("oUx7gRUfjLbYTFQxx0y/5RD+F4PUp1zpOQ0dzFFvRFY2x4ioVCn3ywDjpOcCQUpR", "V7Cu9MtUHod/U+bO4UdVng2NzhXFeWTpHvFMG8bmBWY=", new Class[0]);
                                                gbgVar.h("kF6Jd1sw3q3qw/+0TLn2ko4HVh3R2fnHDWtmvFKAaIlQ9hXvB4VlqN5VKdWvJw1j", "U78MFNuwn7os0/QAHloPzwNLvW28Sv2AVl9cZ/WB06U=", new Class[0]);
                                                gbgVar.h("cpast73oyVGxAsfdJwgMLBMhPcwGBuaRfzY3Bhh3kWL4MebzVk4iFU4Wx0PgZ1kl", "Qm8MG2DrzXgkT9mmjHxWILqdq05Xbm3so5KwQC2McyE=", new Class[0]);
                                                gbgVar.h("nhuP9R4hppNmth1yNrgGWIOXDJip+YNZibYhZu3EiGhPWp2ziegk9lKQZAz5y8Y6", "ZtOWgCuVzbV1YOR1Q2MkCR28/Ahzvo+dfHqW5BEsaGQ=", new Class[0]);
                                                gbgVar.h("Un5AAvnvAy4QGo4F+FxWyo27oJRq8yHXTL/5BO992/Qbcx/AxeRAjUiJCJFf12B5", "RXeMNI8bd8gwJjHGvzfkcshLS49npesklSWQ3zLeALQ=", new Class[0]);
                                                gbgVar.h("b+6HH60+sLG9QsIJiClLOuRdcg8cAH4vbF/y9Ifowp5XD0wqAJQYLs2TXMvc6ISe", "eWXNdRqiEshgW8P2VbEM61AmF5buSCNZF1IJn//7VnA=", new Class[0]);
                                                gbgVar.h("9OHw/fBIPh5YUitiAy+E7UaIungPM7W3DvDu20ziWmDkwtWt66PgGPPL9dk7S03M", "9PuGz9gV/tHA1XAj1YCdJFjSXebPqQ0T6NFbvcYJ/YI=", Context.class, Boolean.TYPE, String.class);
                                                gbgVar.h("36m7R5+OgafAlxXiAkEoQQR21WKyBWJKAZod6Nq18rJJQpmXQNjnRy3s9QWSnihX", "EKoIpn4E+7rk/EjAoawlji56NltS6dGID5hzxPIsPH4=", StackTraceElement[].class);
                                                Class cls = Boolean.TYPE;
                                                gbgVar.h("xFm7w/jUhwmnEJP2poHVI6oNkr84lMyZ79jk2PZ7vzEeS+/REyqGC1qnrzq90fHK", "vQovEcJYjiuxrsTzn42XtuOeuH0MpKCgn9vor95WpUk=", View.class, DisplayMetrics.class, cls, cls);
                                                gbgVar.h("oM6Bx5XwATIp+mbr3vlJrJNQk/at9J7WRvdkNqooo5Oy+1T5rH5nUpgVpKKJdcHF", "hnpmSZMBPYMzYsPjN9tNfe5/9LG1v02OYDAJ2u5L+Wg=", Context.class, Boolean.TYPE);
                                                gbgVar.h("U1WTFZjV3eK/ha6YDRO5wxJp0upAq2qFL5B5WugYKvwWYyw3LbunlDSDs+tJ/YaG", "zztgoRPRBv9ey9qLWmMxj7GgYFgxpVCi5Pwi6+ZK9k8=", View.class, Activity.class, Boolean.TYPE);
                                                gbgVar.h("XO5i/0wDN9HqQegTjenf7ERhMfSZEPMxooGMY4pn2WO+4nZYY36+aT9w/XWj/Cws", "4IjL1kWH0N7BHAfJanI6Zxa2rCt8/vvZPg8dlhK0cII=", Long.TYPE);
                                                gbgVar.h("7frJQxqykbaTf/CFdFg5NzoBJvdghw/LawDsYFrbzCaXUH1X6QRajayyPeGvWUM/", "3qIhtdYRWDswdUaO0bCKMijaZDhXmaC3Pb5yZb2sTUw=", new Class[0]);
                                                gbgVar.h("6HTNPwLYYCxo5NT9ZKcDgPZtw9ukLMVqovi//h8BPLRGmMHxXO8yqWjjbF2L/Jwr", "D+MW4XiWP8LFJQYW7bM90WiSFOpPurq+FfzW3bxBHJs=", Context.class);
                                                gbgVar.h("PbeO0SlKUVlGNS6MIEYH4i7G9ykE7KC+Nt1syl6mrV4vswWGVbTrw4qdCmzF3T9U", "sL97mQooKn62YbR6XApp0zvonPRxZLbFPCVhnf3HfQM=", Context.class);
                                                gbgVar.h("5xIXMAHz6N7CNfb6WZiqMvRQI+37ZQA0jQzIsbF092mLHsi5SPwU/YAI1rnZXIZ7", "2m+QIUuy4BFXaCQU2XlXQM6dPTje1Sr/WU2uJI+z4gY=", Context.class);
                                                Class cls2 = Long.TYPE;
                                                gbgVar.h("iw4EwBgoYu05CXoLW7sIKpJUGjSQb1DZKDE4Ki+MKVgFEcWPNH9mDrrO8q1Hze91", "CHvTxbC7YZeeu/SxrQwyvtBVczJxaHC8NyYPG8HP4Y4=", NetworkCapabilities.class, cls2, cls2);
                                                gbgVar.h("wmaK2ieuKoUFg8t+jeIlrH/07haQgqiIztwBY3Xp0J9CPIEwvYe8MLDTV2YxY2XM", "iM/1sHPPbta3y6hBtnRnzb1RdQC99WgkGoqjG+ZlGiM=", List.class);
                                                Class cls3 = Long.TYPE;
                                                gbgVar.h("Gb3W2hoiG3tKJxNU/09qcc++TL7rePH8jkE20Q4q8tbXyJ2F4pSz0I8NYImfztCQ", "xj7z5QjT4e10J5XA07ZLu+7EoHfaFrLik/EDM4lZxFE=", cls3, cls3, cls3, cls3);
                                            }
                                            a = gbgVar;
                                        } catch (Throwable th) {
                                            gbg.e(file);
                                            gbgVar.i(cacheDir);
                                            gbg.e(new File(String.format("%s/%s.dex", cacheDir, "1787936389793")));
                                            throw th;
                                        }
                                    } catch (SecurityException e) {
                                        throw new gbb(e);
                                    }
                                } catch (gau e2) {
                                    throw new gbb(e2);
                                } catch (FileNotFoundException e3) {
                                    throw new gbb(e3);
                                } catch (IOException e4) {
                                    throw new gbb(e4);
                                } catch (NullPointerException e5) {
                                    throw new gbb(e5);
                                }
                            } catch (gau e6) {
                                throw new gbb(e6);
                            }
                        } catch (IllegalArgumentException e7) {
                            throw new gau(e7);
                        }
                    } catch (gbb unused3) {
                    }
                }
            }
        }
        return a;
    }

    static gbi o(gbg gbgVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws gbb {
        Method methodC = gbgVar.c("4ovyjT/fdRMgrOvUBLYORg7+XTaOp5PyBwRhA0+bP/RuVEP+BXj95dKE/KAkUNap", "rPDVSoK35dQ4QDChybIT3Db/a26BR81F9UAqLx0Za4s=");
        if (methodC == null || motionEvent == null) {
            throw new gbb();
        }
        try {
            return new gbi((String) methodC.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new gbb(e);
        }
    }

    protected static final void q(List list) {
        ExecutorService executorService;
        if (a == null || (executorService = a.b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) jwp.j.d()).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            char[] cArr = gbj.a;
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            String.format("class methods got exception: %s", stringWriter.toString());
        }
    }

    protected static synchronized void r(Context context, ahsm ahsmVar) {
        if (!t) {
            w = System.currentTimeMillis() / 1000;
            a = n(context, ahsmVar.a);
            x = gat.a(context);
            ExecutorService executorService = a.b;
            y = new gbn(context, executorService, gbn.a);
            z = new gbh();
            B = new dov(context, executorService);
            A = new ayq(context, executorService, (fxc) ahsmVar.c, B);
            t = true;
        }
    }

    private final synchronized void s(gbg gbgVar, fxg fxgVar) {
        MotionEvent motionEvent;
        try {
            gbi gbiVarO = o(gbgVar, this.b, this.q);
            Long l = gbiVarO.a;
            if (l != null) {
                long jLongValue = l.longValue();
                fxgVar.copyOnWrite();
                fxl fxlVar = (fxl) fxgVar.instance;
                fxl fxlVar2 = fxl.a;
                fxlVar.b |= SemanticState.Multiline;
                fxlVar.m = jLongValue;
            }
            Long l2 = gbiVarO.b;
            if (l2 != null) {
                long jLongValue2 = l2.longValue();
                fxgVar.copyOnWrite();
                fxl fxlVar3 = (fxl) fxgVar.instance;
                fxl fxlVar4 = fxl.a;
                fxlVar3.b |= 16384;
                fxlVar3.n = jLongValue2;
            }
            Long l3 = gbiVarO.c;
            if (l3 != null) {
                long jLongValue3 = l3.longValue();
                fxgVar.copyOnWrite();
                fxl fxlVar5 = (fxl) fxgVar.instance;
                fxl fxlVar6 = fxl.a;
                fxlVar5.b |= 32768;
                fxlVar5.o = jLongValue3;
            }
            if (this.p) {
                Long l4 = gbiVarO.d;
                if (l4 != null) {
                    long jLongValue4 = l4.longValue();
                    fxgVar.copyOnWrite();
                    fxl fxlVar7 = (fxl) fxgVar.instance;
                    fxl fxlVar8 = fxl.a;
                    fxlVar7.b |= 1073741824;
                    fxlVar7.A = jLongValue4;
                }
                Long l5 = gbiVarO.e;
                if (l5 != null) {
                    long jLongValue5 = l5.longValue();
                    fxgVar.copyOnWrite();
                    fxl fxlVar9 = (fxl) fxgVar.instance;
                    fxl fxlVar10 = fxl.a;
                    fxlVar9.b |= Integer.MIN_VALUE;
                    fxlVar9.B = jLongValue5;
                }
            }
        } catch (gbb unused) {
        }
        aihf aihfVarCreateBuilder = fxj.a.createBuilder();
        if (this.d > 0 && gbj.b(this.q)) {
            long jD = gbj.d(this.k, this.q);
            aihfVarCreateBuilder.copyOnWrite();
            fxj fxjVar = (fxj) aihfVarCreateBuilder.instance;
            fxjVar.b |= SemanticState.Obscured;
            fxjVar.o = jD;
            long jD2 = gbj.d(this.n - this.l, this.q);
            aihfVarCreateBuilder.copyOnWrite();
            fxj fxjVar2 = (fxj) aihfVarCreateBuilder.instance;
            fxjVar2.b |= SemanticState.Multiline;
            fxjVar2.p = jD2;
            long jD3 = gbj.d(this.o - this.m, this.q);
            aihfVarCreateBuilder.copyOnWrite();
            fxj fxjVar3 = (fxj) aihfVarCreateBuilder.instance;
            fxjVar3.b |= 16384;
            fxjVar3.q = jD3;
            long jD4 = gbj.d(this.l, this.q);
            aihfVarCreateBuilder.copyOnWrite();
            fxj fxjVar4 = (fxj) aihfVarCreateBuilder.instance;
            fxjVar4.b |= 131072;
            fxjVar4.t = jD4;
            long jD5 = gbj.d(this.m, this.q);
            aihfVarCreateBuilder.copyOnWrite();
            fxj fxjVar5 = (fxj) aihfVarCreateBuilder.instance;
            fxjVar5.b |= 262144;
            fxjVar5.u = jD5;
            if (this.p && (motionEvent = this.b) != null) {
                long jD6 = gbj.d(((this.l - this.n) + motionEvent.getRawX()) - this.b.getX(), this.q);
                if (jD6 != 0) {
                    aihfVarCreateBuilder.copyOnWrite();
                    fxj fxjVar6 = (fxj) aihfVarCreateBuilder.instance;
                    fxjVar6.b |= 32768;
                    fxjVar6.r = jD6;
                }
                long jD7 = gbj.d(((this.m - this.o) + this.b.getRawY()) - this.b.getY(), this.q);
                if (jD7 != 0) {
                    aihfVarCreateBuilder.copyOnWrite();
                    fxj fxjVar7 = (fxj) aihfVarCreateBuilder.instance;
                    fxjVar7.b |= 65536;
                    fxjVar7.s = jD7;
                }
            }
        }
        try {
            gbi gbiVarJ = j(this.b);
            Long l6 = gbiVarJ.a;
            if (l6 != null) {
                long jLongValue6 = l6.longValue();
                aihfVarCreateBuilder.copyOnWrite();
                fxj fxjVar8 = (fxj) aihfVarCreateBuilder.instance;
                fxjVar8.b |= 1;
                fxjVar8.c = jLongValue6;
            }
            Long l7 = gbiVarJ.b;
            if (l7 != null) {
                long jLongValue7 = l7.longValue();
                aihfVarCreateBuilder.copyOnWrite();
                fxj fxjVar9 = (fxj) aihfVarCreateBuilder.instance;
                fxjVar9.b |= 2;
                fxjVar9.d = jLongValue7;
            }
            long jLongValue8 = gbiVarJ.c.longValue();
            aihfVarCreateBuilder.copyOnWrite();
            fxj fxjVar10 = (fxj) aihfVarCreateBuilder.instance;
            fxjVar10.b |= SemanticState.Focused;
            fxjVar10.j = jLongValue8;
            if (this.p) {
                Long l8 = gbiVarJ.e;
                if (l8 != null) {
                    long jLongValue9 = l8.longValue();
                    aihfVarCreateBuilder.copyOnWrite();
                    fxj fxjVar11 = (fxj) aihfVarCreateBuilder.instance;
                    fxjVar11.b |= 4;
                    fxjVar11.e = jLongValue9;
                }
                Long l9 = gbiVarJ.d;
                if (l9 != null) {
                    long jLongValue10 = l9.longValue();
                    aihfVarCreateBuilder.copyOnWrite();
                    fxj fxjVar12 = (fxj) aihfVarCreateBuilder.instance;
                    fxjVar12.b |= 16;
                    fxjVar12.g = jLongValue10;
                }
                Long l10 = gbiVarJ.f;
                if (l10 != null) {
                    int i = l10.longValue() != 0 ? 2 : 1;
                    aihfVarCreateBuilder.copyOnWrite();
                    fxj fxjVar13 = (fxj) aihfVarCreateBuilder.instance;
                    fxjVar13.i = i - 1;
                    fxjVar13.b |= 64;
                }
                if (this.e > 0) {
                    Long lValueOf = gbj.b(this.q) ? Long.valueOf(Math.round(this.j / this.e)) : null;
                    if (lValueOf != null) {
                        long jLongValue11 = lValueOf.longValue();
                        aihfVarCreateBuilder.copyOnWrite();
                        fxj fxjVar14 = (fxj) aihfVarCreateBuilder.instance;
                        fxjVar14.b |= 8;
                        fxjVar14.f = jLongValue11;
                    } else {
                        aihfVarCreateBuilder.copyOnWrite();
                        fxj fxjVar15 = (fxj) aihfVarCreateBuilder.instance;
                        fxjVar15.b &= -9;
                        fxjVar15.f = -1L;
                    }
                    long jRound = Math.round(this.i / this.e);
                    aihfVarCreateBuilder.copyOnWrite();
                    fxj fxjVar16 = (fxj) aihfVarCreateBuilder.instance;
                    fxjVar16.b |= 32;
                    fxjVar16.h = jRound;
                }
                Long l11 = gbiVarJ.i;
                if (l11 != null) {
                    long jLongValue12 = l11.longValue();
                    aihfVarCreateBuilder.copyOnWrite();
                    fxj fxjVar17 = (fxj) aihfVarCreateBuilder.instance;
                    fxjVar17.b |= SemanticState.LiveRegion;
                    fxjVar17.l = jLongValue12;
                }
                Long l12 = gbiVarJ.j;
                if (l12 != null) {
                    long jLongValue13 = l12.longValue();
                    aihfVarCreateBuilder.copyOnWrite();
                    fxj fxjVar18 = (fxj) aihfVarCreateBuilder.instance;
                    fxjVar18.b |= SemanticState.Hidden;
                    fxjVar18.k = jLongValue13;
                }
                Long l13 = gbiVarJ.k;
                if (l13 != null) {
                    int i2 = l13.longValue() != 0 ? 2 : 1;
                    aihfVarCreateBuilder.copyOnWrite();
                    fxj fxjVar19 = (fxj) aihfVarCreateBuilder.instance;
                    fxjVar19.m = i2 - 1;
                    fxjVar19.b |= SemanticState.ReadOnly;
                }
            }
        } catch (gbb unused2) {
        }
        long j = this.h;
        if (j > 0) {
            aihfVarCreateBuilder.copyOnWrite();
            fxj fxjVar20 = (fxj) aihfVarCreateBuilder.instance;
            fxjVar20.b |= SemanticState.Modal;
            fxjVar20.n = j;
        }
        fxj fxjVar21 = (fxj) aihfVarCreateBuilder.build();
        fxgVar.copyOnWrite();
        fxl fxlVar11 = (fxl) fxgVar.instance;
        fxl fxlVar12 = fxl.a;
        fxjVar21.getClass();
        fxlVar11.Q = fxjVar21;
        fxlVar11.c |= 262144;
        long j2 = this.d;
        if (j2 > 0) {
            fxgVar.copyOnWrite();
            fxl fxlVar13 = (fxl) fxgVar.instance;
            fxlVar13.c |= 8;
            fxlVar13.E = j2;
        }
        long j3 = this.e;
        if (j3 > 0) {
            fxgVar.copyOnWrite();
            fxl fxlVar14 = (fxl) fxgVar.instance;
            fxlVar14.c |= 4;
            fxlVar14.D = j3;
        }
        long j4 = this.f;
        if (j4 > 0) {
            fxgVar.copyOnWrite();
            fxl fxlVar15 = (fxl) fxgVar.instance;
            fxlVar15.c |= 2;
            fxlVar15.C = j4;
        }
        long j5 = this.g;
        if (j5 > 0) {
            fxgVar.copyOnWrite();
            fxl fxlVar16 = (fxl) fxgVar.instance;
            fxlVar16.c |= 16;
            fxlVar16.F = j5;
        }
        try {
            LinkedList linkedList = this.c;
            int size = linkedList.size() - 1;
            if (size > 0) {
                fxgVar.copyOnWrite();
                ((fxl) fxgVar.instance).R = fxl.emptyProtobufList();
                for (int i3 = 0; i3 < size; i3++) {
                    gbi gbiVarO2 = o(a, (MotionEvent) linkedList.get(i3), this.q);
                    aihf aihfVarCreateBuilder2 = fxj.a.createBuilder();
                    long jLongValue14 = gbiVarO2.a.longValue();
                    aihfVarCreateBuilder2.copyOnWrite();
                    fxj fxjVar22 = (fxj) aihfVarCreateBuilder2.instance;
                    fxjVar22.b |= 1;
                    fxjVar22.c = jLongValue14;
                    long jLongValue15 = gbiVarO2.b.longValue();
                    aihfVarCreateBuilder2.copyOnWrite();
                    fxj fxjVar23 = (fxj) aihfVarCreateBuilder2.instance;
                    fxjVar23.b |= 2;
                    fxjVar23.d = jLongValue15;
                    fxgVar.a((fxj) aihfVarCreateBuilder2.build());
                }
            }
        } catch (gbb unused3) {
            fxgVar.copyOnWrite();
            ((fxl) fxgVar.instance).R = fxl.emptyProtobufList();
        }
    }

    private static final void t() {
        gbn gbnVar = y;
        if (gbnVar != null) {
            gbnVar.c();
        }
    }

    @Override // defpackage.gam
    protected final long a(StackTraceElement[] stackTraceElementArr) throws gbb {
        Method methodC = a.c("36m7R5+OgafAlxXiAkEoQQR21WKyBWJKAZod6Nq18rJJQpmXQNjnRy3s9QWSnihX", "EKoIpn4E+7rk/EjAoawlji56NltS6dGID5hzxPIsPH4=");
        if (methodC == null || stackTraceElementArr == null) {
            throw new gbb();
        }
        try {
            return new gbc((String) methodC.invoke(null, stackTraceElementArr)).a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new gbb(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.gam
    protected final fxg b(Context context, View view, Activity activity) {
        t();
        z.a();
        fxg fxgVar = (fxg) fxl.a.createBuilder();
        if (!TextUtils.isEmpty(this.v.b)) {
            ahsm ahsmVar = this.v;
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            Object obj = ahsmVar.b;
            obj.getClass();
            fxlVar.b |= 2;
            fxlVar.g = (String) obj;
        }
        p(n(context, this.v.a), fxgVar, view, activity, true, context);
        return fxgVar;
    }

    @Override // defpackage.gam
    protected final fxg h(Context context, View view, Activity activity) {
        t();
        z.c(context, view);
        fxg fxgVar = (fxg) fxl.a.createBuilder();
        fxgVar.copyOnWrite();
        fxl fxlVar = (fxl) fxgVar.instance;
        Object obj = this.v.b;
        obj.getClass();
        fxlVar.b |= 2;
        fxlVar.g = (String) obj;
        p(n(context, this.v.a), fxgVar, view, activity, false, context);
        return fxgVar;
    }

    @Override // defpackage.gam, defpackage.gal
    public final void i(View view) {
        if (((Boolean) jwp.m.d()).booleanValue()) {
            gbm gbmVar = this.u;
            if (gbmVar == null) {
                gbg gbgVar = a;
                gbm gbmVar2 = new gbm(gbgVar.a, gbgVar.m);
                this.u = gbmVar2;
                gbmVar = gbmVar2;
            }
            gbmVar.d(view);
        }
    }

    @Override // defpackage.gam
    protected final gbi j(MotionEvent motionEvent) throws gbb {
        Method methodC = a.c("GuqxRBsJS/+OvCTLDr1B95LWVXdtVdNQnafVtgGYhcISvoc5fJW1gkuZ//YinBfq", "UiuMHhJ1mbDz7OKuvBCjrkbDs0dRozC2X1qswd5tPbY=");
        if (methodC == null || motionEvent == null) {
            throw new gbb();
        }
        try {
            return new gbi((String) methodC.invoke(null, motionEvent, this.q));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new gbb(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.gam
    protected final fxg l(Context context) {
        long jA;
        long j;
        gbn gbnVar = y;
        if (gbnVar != null) {
            gbnVar.c();
        }
        z.b();
        fxg fxgVar = (fxg) fxl.a.createBuilder();
        if (!TextUtils.isEmpty(this.v.b)) {
            ahsm ahsmVar = this.v;
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            Object obj = ahsmVar.b;
            obj.getClass();
            fxlVar.b |= 2;
            fxlVar.g = (String) obj;
        }
        gbg gbgVarN = n(context, this.v.a);
        if (gbgVarN.b != null) {
            int iA = gbgVarN.a();
            ArrayList arrayList = new ArrayList();
            if (gbgVarN.l) {
                arrayList.add(new gbs(gbgVarN, fxgVar, iA, context, (fxc) this.v.c, A));
                arrayList.add(new gbv(gbgVarN, fxgVar, w, iA));
                arrayList.add(new gcf(gbgVarN, fxgVar, iA));
                arrayList.add(new gci(gbgVarN, fxgVar, iA, context));
                arrayList.add(new gcn(gbgVarN, fxgVar, iA));
                arrayList.add(new gbr(gbgVarN, fxgVar, iA, context));
                arrayList.add(new gbt(gbgVarN, fxgVar, iA));
                arrayList.add(new gce(gbgVarN, fxgVar, iA));
                arrayList.add(new gcg(gbgVarN, fxgVar, iA));
                arrayList.add(new gbu(gbgVarN, fxgVar, iA));
                arrayList.add(new gca(gbgVarN, fxgVar, iA));
                arrayList.add(new gco(gbgVarN, fxgVar, iA));
                arrayList.add(new gbq(gbgVarN, fxgVar, iA));
                arrayList.add(new gcl(gbgVarN, fxgVar, iA));
                arrayList.add(new gcj(gbgVarN, fxgVar, iA));
                gbn gbnVar2 = y;
                if (gbnVar2 != null) {
                    long jB = gbnVar2.b();
                    jA = gbnVar2.a();
                    j = jB;
                } else {
                    jA = -1;
                    j = -1;
                }
                arrayList.add(new gcd(gbgVarN, fxgVar, iA, x, j, jA));
                arrayList.add(new gch(gbgVarN, fxgVar, iA));
                arrayList.add(new gcb(gbgVarN, fxgVar, iA));
                arrayList.add(new gbp(gbgVarN, fxgVar, iA));
                if (((Boolean) jwp.u.d()).booleanValue()) {
                    arrayList.add(new gbw(gbgVarN, fxgVar, iA));
                }
                if (((Boolean) jwp.v.d()).booleanValue()) {
                    arrayList.add(new gbz(gbgVarN, fxgVar, iA));
                }
            } else {
                fxgVar.copyOnWrite();
                fxl fxlVar2 = (fxl) fxgVar.instance;
                fxlVar2.b |= 524288;
                fxlVar2.q = 16384L;
            }
            q(arrayList);
        }
        return fxgVar;
    }

    protected final void p(gbg gbgVar, fxg fxgVar, View view, Activity activity, boolean z2, Context context) {
        List listAsList;
        long jA;
        long j;
        if (gbgVar.l) {
            s(gbgVar, fxgVar);
            ArrayList arrayList = new ArrayList();
            if (gbgVar.b != null) {
                int iA = gbgVar.a();
                if (((Boolean) jwp.o.d()).booleanValue()) {
                    arrayList.add(new gbs(gbgVar, fxgVar, iA, context, (fxc) this.v.c, A));
                    arrayList.add(new gbr(gbgVar, fxgVar, iA, context));
                    arrayList.add(new gci(gbgVar, fxgVar, iA, context));
                    arrayList.add(new gcn(gbgVar, fxgVar, iA));
                    gbn gbnVar = y;
                    if (gbnVar != null) {
                        long jB = gbnVar.b();
                        jA = gbnVar.a();
                        j = jB;
                    } else {
                        jA = -1;
                        j = -1;
                    }
                    arrayList.add(new gcd(gbgVar, fxgVar, iA, x, j, jA));
                    arrayList.add(new gch(gbgVar, fxgVar, iA));
                }
                arrayList.add(new gbx(gbgVar, fxgVar));
                arrayList.add(new gcf(gbgVar, fxgVar, iA));
                arrayList.add(new gbv(gbgVar, fxgVar, w, iA));
                arrayList.add(new gbu(gbgVar, fxgVar, iA));
                arrayList.add(new gce(gbgVar, fxgVar, iA));
                arrayList.add(new gcg(gbgVar, fxgVar, iA));
                arrayList.add(new gca(gbgVar, fxgVar, iA));
                arrayList.add(new gbt(gbgVar, fxgVar, iA));
                arrayList.add(new gco(gbgVar, fxgVar, iA));
                arrayList.add(new gbq(gbgVar, fxgVar, iA));
                arrayList.add(new gcl(gbgVar, fxgVar, iA));
                arrayList.add(new gck(gbgVar, fxgVar, iA, new Throwable().getStackTrace()));
                arrayList.add(new gcp(gbgVar, fxgVar, iA, view));
                arrayList.add(new gcj(gbgVar, fxgVar, iA));
                if (((Boolean) jwp.k.d()).booleanValue()) {
                    arrayList.add(new gbo(gbgVar, fxgVar, iA, view, activity));
                }
                arrayList.add(new gbp(gbgVar, fxgVar, iA));
                if (!z2) {
                    arrayList.add(new gby(gbgVar, fxgVar, iA, z));
                    arrayList.add(new gcc(gbgVar, fxgVar, iA, this.r));
                } else if (((Boolean) jwp.m.d()).booleanValue()) {
                    arrayList.add(new gcm(gbgVar, fxgVar, iA, this.u));
                }
            }
            listAsList = arrayList;
        } else {
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxlVar.b |= 524288;
            fxlVar.q = 16384L;
            listAsList = Arrays.asList(new gbx(gbgVar, fxgVar));
        }
        q(listAsList);
    }
}
