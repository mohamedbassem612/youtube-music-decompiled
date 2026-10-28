package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import com.google.common.util.concurrent.SettableFuture;
import com.google.research.xeno.effect.RemoteAssetManager;
import io.grpc.Status;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import org.chromium.net.CallbackException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agrq implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public /* synthetic */ agrq(Object obj, ahrs ahrsVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = ahrsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qds] */
    /* JADX WARN: Type inference failed for: r0v41, types: [auyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [ahrs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r13v4, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v41, types: [atvz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5, types: [ahrs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Exception {
        byte[] bArrH;
        ByteBuffer byteBufferAllocateDirect;
        int iRemaining = 0;
        switch (this.$cid) {
            case 0:
                ((agrr) this.b).a.remove(this.a);
                return;
            case 1:
                TikTokListenableWorker.c(this.b, this.a);
                return;
            case 2:
                Object obj = this.a;
                ahrs ahrsVar = ((ahpb) obj).b;
                ?? r13 = this.b;
                if (ahrsVar != ahpb.a) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (obj) {
                    ((ahpb) obj).b = r13;
                    break;
                }
                return;
            case 3:
                ((ahoy) this.a).b(this.b);
                return;
            case 4:
                int i = ahpj.c;
                Object obj2 = this.a;
                try {
                    ((avgj) obj2).b(this.b.call());
                    return;
                } catch (Exception e) {
                    ((avgj) obj2).c(e);
                    return;
                }
            case 5:
                int i2 = ahpj.c;
                try {
                    this.b.run();
                    return;
                } catch (Exception e2) {
                    ((avgj) this.a).c(e2);
                    return;
                }
            case 6:
                int i3 = ahpj.c;
                try {
                    this.b.run();
                    return;
                } catch (Exception e3) {
                    ((avgj) this.a).c(e3);
                    throw e3;
                }
            case 7:
                int i4 = ahpj.c;
                Object obj3 = this.a;
                try {
                    this.b.run();
                    ((avgj) obj3).b(null);
                    return;
                } catch (Exception e4) {
                    ((avgj) obj3).c(e4);
                    return;
                }
            case 8:
                Object obj4 = this.a;
                try {
                    URL url = ((ahte) this.b).a;
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
                        throw new IOException("Content-Length exceeds max size of 1048576");
                    }
                    InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                    try {
                        ahsn ahsnVar = new ahsn(inputStream);
                        ArrayDeque arrayDeque = new ArrayDeque(20);
                        int i5 = SemanticState.Focused;
                        int i6 = 0;
                        while (true) {
                            if (i6 < 2147483639) {
                                int iMin = Math.min(i5, 2147483639 - i6);
                                byte[] bArr = new byte[iMin];
                                arrayDeque.add(bArr);
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= iMin) {
                                        long j = ((long) i5) * ((long) (i5 < 4096 ? 4 : 2));
                                        i5 = j > 2147483647L ? Alert.DURATION_SHOW_INDEFINITELY : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
                                    } else {
                                        int i8 = ahsnVar.read(bArr, i7, iMin - i7);
                                        if (i8 == -1) {
                                            bArrH = a.h(arrayDeque, i6);
                                        } else {
                                            i7 += i8;
                                            i6 += i8;
                                        }
                                    }
                                }
                            } else {
                                if (ahsnVar.read() != -1) {
                                    throw new OutOfMemoryError("input is too large to fit in a byte array");
                                }
                                bArrH = a.h(arrayDeque, 2147483639);
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        int length = bArrH.length;
                        if (length > 1048576) {
                            throw new IOException("Image exceeds max size of 1048576");
                        }
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrH, 0, length);
                        if (bitmapDecodeByteArray == null) {
                            throw new IOException("Failed to decode image: ".concat(url.toString()));
                        }
                        ((kjc) obj4).v(bitmapDecodeByteArray);
                        return;
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            break;
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    ((kjc) obj4).u(e5);
                    return;
                }
            case 9:
                ahuo ahuoVar = (ahuo) this.a;
                ?? r2 = ahuoVar.d.a;
                if (r2.isEmpty()) {
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
                } else if (r2.size() == 1) {
                    ByteBuffer byteBuffer = (ByteBuffer) r2.get(0);
                    if (byteBuffer.hasRemaining()) {
                        byteBuffer.flip();
                    }
                    byteBuffer.position(0);
                    byteBufferAllocateDirect = byteBuffer;
                } else {
                    for (ByteBuffer byteBuffer2 : r2) {
                        byteBuffer2.flip();
                        iRemaining += byteBuffer2.remaining();
                    }
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect(iRemaining);
                    Iterator it = r2.iterator();
                    while (it.hasNext()) {
                        byteBufferAllocateDirect.put((ByteBuffer) it.next());
                    }
                    byteBufferAllocateDirect.flip();
                }
                agsn agsnVar = ahup.a;
                UrlResponseInfo urlResponseInfo = (UrlResponseInfo) this.b;
                ahuoVar.a(urlResponseInfo);
                byteBufferAllocateDirect.remaining();
                SettableFuture settableFuture = ahuoVar.a;
                ahuy ahuyVar = new ahuy();
                ahuyVar.a(ahuo.b(urlResponseInfo.getAllHeaders()));
                ahuyVar.b(byteBufferAllocateDirect);
                ahuyVar.d = urlResponseInfo.getHttpStatusCode();
                ahuyVar.b.addAll(ahuoVar.c);
                settableFuture.set(new aami(ahuyVar));
                return;
            case 10:
                Object obj5 = this.b;
                if (!(obj5 instanceof CallbackException) && (obj5 instanceof NetworkException)) {
                    ((NetworkException) obj5).getErrorCode();
                }
                ((ahuo) this.a).a.setException(new ahuq((Throwable) obj5));
                return;
            case 11:
                this.a.a(((RemoteAssetManager) this.b).b);
                return;
            case 12:
                break;
            case 13:
                Status status = (Status) this.a;
                ((aveo) this.b).e.b(status.getDescription(), status.p);
                return;
            case 14:
                ((aveo) this.a).e.d(this.b);
                return;
            case 15:
                ((aven) this.b).u((avbe) this.a);
                return;
            case 16:
                ((aven) this.a).v(this.b);
                return;
            case 17:
                ((aveu) this.b).h.t(this.a);
                return;
            case 18:
                ((aveu) this.b).h.k((auzl) this.a);
                return;
            case 19:
                ((aveu) this.b).h.j((auzi) this.a);
                return;
            default:
                ((aveu) this.a).h.u((InputStream) this.b);
                return;
        }
        while (true) {
            atvy atvyVar = (atvy) this.a;
            agke agkeVar = atvyVar.d;
            if (iRemaining >= ((agpi) agkeVar).d) {
                RemoteAssetManager remoteAssetManager = (RemoteAssetManager) this.b;
                remoteAssetManager.b = RemoteAssetManager.nativeCreateRemoteAssetManager(atvyVar.a, atvyVar.b, atvyVar.c, remoteAssetManager.c);
                return;
            } else {
                atqn.a(new File((String) agkeVar.get(iRemaining)));
                iRemaining++;
            }
        }
    }

    public agrq(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj2;
        this.b = obj;
    }

    public /* synthetic */ agrq(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public agrq(Object obj, Object obj2, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj2;
        this.a = obj;
    }
}
