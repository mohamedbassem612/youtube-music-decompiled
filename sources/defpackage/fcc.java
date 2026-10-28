package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import app.rive.semantics.SemanticState;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcc implements eua {
    private static final ci d = new ci(null, null, null, null);
    private final Context a;
    private final List b;
    private final pj c;
    private final ci e;

    public fcc(Context context, List list, ewn ewnVar, ewv ewvVar) {
        ci ciVar = d;
        this.a = context.getApplicationContext();
        this.b = list;
        this.c = new pj(ewnVar, ewvVar);
        this.e = ciVar;
    }

    @Override // defpackage.eua
    public final /* bridge */ /* synthetic */ ewf a(Object obj, int i, int i2, ety etyVar) {
        etc etcVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        etd etdVarV = this.e.V(byteBuffer);
        try {
            double d2 = ffn.a;
            SystemClock.elapsedRealtimeNanos();
            if (etdVarV.b == null) {
                throw new IllegalStateException("You must call setData() before parseHeader()");
            }
            fcg fcgVar = null;
            if (etdVarV.e()) {
                etcVar = etdVarV.c;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < 6; i3++) {
                    sb.append((char) etdVarV.a());
                }
                if (sb.toString().startsWith("GIF")) {
                    etdVarV.c.f = etdVarV.b();
                    etdVarV.c.g = etdVarV.b();
                    int iA = etdVarV.a();
                    etc etcVar2 = etdVarV.c;
                    etcVar2.h = (iA & SemanticState.Focused) != 0;
                    etcVar2.i = (int) Math.pow(2.0d, (iA & 7) + 1);
                    etdVarV.c.j = etdVarV.a();
                    etdVarV.c.k = etdVarV.a();
                    if (etdVarV.c.h && !etdVarV.e()) {
                        etc etcVar3 = etdVarV.c;
                        etcVar3.a = etdVarV.f(etcVar3.i);
                        etc etcVar4 = etdVarV.c;
                        etcVar4.l = etcVar4.a[etcVar4.j];
                    }
                } else {
                    etdVarV.c.b = 1;
                }
                if (!etdVarV.e()) {
                    while (!etdVarV.e()) {
                        int i4 = etdVarV.c.c;
                        int iA2 = etdVarV.a();
                        if (iA2 == 33) {
                            int iA3 = etdVarV.a();
                            if (iA3 == 1) {
                                etdVarV.d();
                            } else if (iA3 == 249) {
                                etdVarV.c.d = new etb();
                                etdVarV.a();
                                int iA4 = etdVarV.a();
                                etb etbVar = etdVarV.c.d;
                                int i5 = (iA4 & 28) >> 2;
                                etbVar.g = i5;
                                if (i5 == 0) {
                                    etbVar.g = 1;
                                }
                                etbVar.f = 1 == (iA4 & 1);
                                int iB = etdVarV.b();
                                if (iB < 2) {
                                    iB = 10;
                                }
                                etb etbVar2 = etdVarV.c.d;
                                etbVar2.i = iB * 10;
                                etbVar2.h = etdVarV.a();
                                etdVarV.a();
                            } else if (iA3 == 254) {
                                etdVarV.d();
                            } else if (iA3 != 255) {
                                etdVarV.d();
                            } else {
                                etdVarV.c();
                                StringBuilder sb2 = new StringBuilder();
                                for (int i6 = 0; i6 < 11; i6++) {
                                    sb2.append((char) etdVarV.a[i6]);
                                }
                                if (sb2.toString().equals("NETSCAPE2.0")) {
                                    do {
                                        etdVarV.c();
                                        byte[] bArr = etdVarV.a;
                                        if (bArr[0] == 1) {
                                            etdVarV.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                        }
                                        if (etdVarV.d <= 0) {
                                            break;
                                        }
                                    } while (!etdVarV.e());
                                } else {
                                    etdVarV.d();
                                }
                            }
                        } else if (iA2 == 44) {
                            etc etcVar5 = etdVarV.c;
                            if (etcVar5.d == null) {
                                etcVar5.d = new etb();
                            }
                            etcVar5.d.a = etdVarV.b();
                            etdVarV.c.d.b = etdVarV.b();
                            etdVarV.c.d.c = etdVarV.b();
                            etdVarV.c.d.d = etdVarV.b();
                            int iA5 = etdVarV.a();
                            int i7 = iA5 & SemanticState.Focused;
                            int iPow = (int) Math.pow(2.0d, (iA5 & 7) + 1);
                            etb etbVar3 = etdVarV.c.d;
                            etbVar3.e = (iA5 & 64) != 0;
                            if (i7 != 0) {
                                etbVar3.k = etdVarV.f(iPow);
                            } else {
                                etbVar3.k = null;
                            }
                            etdVarV.c.d.j = etdVarV.b.position();
                            etdVarV.a();
                            etdVarV.d();
                            if (!etdVarV.e()) {
                                etc etcVar6 = etdVarV.c;
                                etcVar6.c++;
                                etcVar6.e.add(etcVar6.d);
                            }
                        } else {
                            if (iA2 == 59) {
                                break;
                            }
                            etdVarV.c.b = 1;
                        }
                    }
                    etc etcVar7 = etdVarV.c;
                    if (etcVar7.c < 0) {
                        etcVar7.b = 1;
                    }
                }
                etcVar = etdVarV.c;
            }
            if (etcVar.c > 0 && etcVar.b == 0) {
                Bitmap.Config config = etyVar.b(fck.a) == etg.b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(etcVar.g / i2, etcVar.f / i);
                ete eteVar = new ete(this.c, etcVar, byteBuffer, Math.max(1, iMin != 0 ? Integer.highestOneBit(iMin) : 0));
                if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
                    throw new IllegalArgumentException("Unsupported format: " + String.valueOf(config) + ", must be one of " + String.valueOf(Bitmap.Config.ARGB_8888) + " or " + String.valueOf(Bitmap.Config.RGB_565));
                }
                eteVar.i = config;
                eteVar.b();
                Bitmap bitmapA = eteVar.a();
                if (bitmapA != null) {
                    fcgVar = new fcg(new fce(new fcd(new fcj(erj.b(this.a), eteVar, i, i2, ezr.b, bitmapA))));
                }
            }
            this.e.W(etdVarV);
            return fcgVar;
        } catch (Throwable th) {
            this.e.W(etdVarV);
            throw th;
        }
    }

    @Override // defpackage.eua
    public final /* bridge */ /* synthetic */ boolean b(Object obj, ety etyVar) {
        return !((Boolean) etyVar.b(fck.b)).booleanValue() && ept.b(this.b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }
}
