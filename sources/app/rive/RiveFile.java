package app.rive;

import app.rive.core.ArtboardHandle;
import app.rive.core.CheckableAutoCloseable;
import app.rive.core.CloseOnce;
import app.rive.core.CommandQueue;
import app.rive.core.FileHandle;
import app.rive.core.SuspendLazy;
import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awqx;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveFile implements CheckableAutoCloseable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final SuspendLazy artboardNamesCache;
    private final CloseOnce closer;
    private final Map defaultViewModelInfoCache;
    private final SuspendLazy enumsCache;
    private final SuspendLazy fileAssetsCache;
    private final long fileHandle;
    private final Map instanceNamesCache;
    private final Map propertiesCache;
    private final CommandQueue riveWorker;
    private final SuspendLazy viewModelNamesCache;

    private RiveFile(long j, CommandQueue commandQueue) {
        commandQueue.getClass();
        this.fileHandle = j;
        this.riveWorker = commandQueue;
        this.closer = new CloseOnce(FileHandle.m533toStringimpl(j), new Function0() { // from class: app.rive.RiveFile$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveFile.closer$lambda$0(this.f$0);
            }
        });
        commandQueue.acquire("Rive/File");
        this.artboardNamesCache = new SuspendLazy(new RiveFile$artboardNamesCache$1(this, null));
        this.fileAssetsCache = new SuspendLazy(new RiveFile$fileAssetsCache$1(this, null));
        this.viewModelNamesCache = new SuspendLazy(new RiveFile$viewModelNamesCache$1(this, null));
        this.instanceNamesCache = new LinkedHashMap();
        this.propertiesCache = new LinkedHashMap();
        this.enumsCache = new SuspendLazy(new RiveFile$enumsCache$1(this, null));
        this.defaultViewModelInfoCache = new LinkedHashMap();
    }

    static final awmy closer$lambda$0(final RiveFile riveFile) {
        RiveLog.INSTANCE.getLogger().d("Rive/File", new Function0() { // from class: app.rive.RiveFile$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveFile.closer$lambda$0$0(this.f$0);
            }
        });
        riveFile.riveWorker.m418deleteFiledJ1Evnk(riveFile.fileHandle);
        riveFile.riveWorker.release("Rive/File", "RiveFile closed");
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closer$lambda$0$0(RiveFile riveFile) {
        return "Deleting ".concat(FileHandle.m533toStringimpl(riveFile.fileHandle));
    }

    public final void checkOpen$third_party_java_android_libs_rive_rive_android() {
        this.closer.checkOpen();
    }

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    public final Object getArtboardNames(awoq awoqVar) {
        this.closer.checkOpen();
        return this.artboardNamesCache.await(awoqVar);
    }

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    public final Object getDefaultViewModelInfo(Artboard artboard, awoq awoqVar) {
        SuspendLazy suspendLazy;
        this.closer.checkOpen();
        artboard.checkOpen$third_party_java_android_libs_rive_rive_android();
        artboard.requireFromFile$third_party_java_android_libs_rive_rive_android(this);
        synchronized (this.defaultViewModelInfoCache) {
            Map map = this.defaultViewModelInfoCache;
            ArtboardHandle artboardHandleM370boximpl = ArtboardHandle.m370boximpl(artboard.m269getArtboardHandlenSTdbJo());
            Object suspendLazy2 = map.get(artboardHandleM370boximpl);
            if (suspendLazy2 == null) {
                suspendLazy2 = new SuspendLazy(new RiveFile$getDefaultViewModelInfo$2$1$1(this, artboard, null));
                map.put(artboardHandleM370boximpl, suspendLazy2);
            }
            suspendLazy = (SuspendLazy) suspendLazy2;
        }
        return suspendLazy.await(awoqVar);
    }

    public final Object getEnums(awoq awoqVar) {
        this.closer.checkOpen();
        return this.enumsCache.await(awoqVar);
    }

    public final Object getFileAssets(awoq awoqVar) {
        this.closer.checkOpen();
        return this.fileAssetsCache.await(awoqVar);
    }

    /* JADX INFO: renamed from: getFileHandle-ENT3xMk, reason: not valid java name */
    public final long m289getFileHandleENT3xMk() {
        return this.fileHandle;
    }

    public final CommandQueue getRiveWorker() {
        return this.riveWorker;
    }

    public final Object getViewModelInstanceNames(String str, awoq awoqVar) {
        SuspendLazy suspendLazy;
        this.closer.checkOpen();
        synchronized (this.instanceNamesCache) {
            Map map = this.instanceNamesCache;
            Object suspendLazy2 = map.get(str);
            if (suspendLazy2 == null) {
                suspendLazy2 = new SuspendLazy(new RiveFile$getViewModelInstanceNames$2$1$1(this, str, null));
                map.put(str, suspendLazy2);
            }
            suspendLazy = (SuspendLazy) suspendLazy2;
        }
        return suspendLazy.await(awoqVar);
    }

    public final Object getViewModelNames(awoq awoqVar) {
        this.closer.checkOpen();
        return this.viewModelNamesCache.await(awoqVar);
    }

    public final Object getViewModelProperties(String str, awoq awoqVar) {
        SuspendLazy suspendLazy;
        this.closer.checkOpen();
        synchronized (this.propertiesCache) {
            Map map = this.propertiesCache;
            Object suspendLazy2 = map.get(str);
            if (suspendLazy2 == null) {
                suspendLazy2 = new SuspendLazy(new RiveFile$getViewModelProperties$2$1$1(this, str, null));
                map.put(str, suspendLazy2);
            }
            suspendLazy = (SuspendLazy) suspendLazy2;
        }
        return suspendLazy.await(awoqVar);
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        static final String load$lambda$0(RiveFileSource riveFileSource) {
            Objects.toString(riveFileSource);
            return "Loading Rive file from source: ".concat(String.valueOf(riveFileSource));
        }

        static final String load$lambda$2(RiveFileSource riveFileSource, long j) {
            return "Loaded Rive file from source: " + riveFileSource + "; " + FileHandle.m533toStringimpl(j);
        }

        static final String load$lambda$3(RiveFileSource riveFileSource) {
            Objects.toString(riveFileSource);
            return "Rive file loading was cancelled: ".concat(String.valueOf(riveFileSource));
        }

        static final String load$lambda$4(RiveFileSource riveFileSource) {
            Objects.toString(riveFileSource);
            return "Error loading Rive file with source: ".concat(String.valueOf(riveFileSource));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object fromSource(RiveFileSource riveFileSource, CommandQueue commandQueue, awoq awoqVar) throws Throwable {
            RiveFile$Companion$fromSource$1 riveFile$Companion$fromSource$1;
            if (awoqVar instanceof RiveFile$Companion$fromSource$1) {
                riveFile$Companion$fromSource$1 = (RiveFile$Companion$fromSource$1) awoqVar;
                int i = riveFile$Companion$fromSource$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    riveFile$Companion$fromSource$1.label = i - Integer.MIN_VALUE;
                } else {
                    riveFile$Companion$fromSource$1 = new RiveFile$Companion$fromSource$1(this, awoqVar);
                }
            } else {
                riveFile$Companion$fromSource$1 = new RiveFile$Companion$fromSource$1(this, awoqVar);
            }
            Object objLoad = riveFile$Companion$fromSource$1.result;
            Object obj = awox.a;
            int i2 = riveFile$Companion$fromSource$1.label;
            try {
                if (i2 == 0) {
                    atqp.j(objLoad);
                    riveFile$Companion$fromSource$1.label = 1;
                    objLoad = load(riveFileSource, commandQueue, riveFile$Companion$fromSource$1);
                    if (objLoad == obj) {
                        return obj;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    atqp.j(objLoad);
                }
                return new Result.Success(objLoad);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                return new Result.Error(e2);
            }
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00a7 A[Catch: Exception -> 0x00c6, CancellationException -> 0x00db, PHI: r6 r7 r8
          0x00a7: PHI (r6v18 java.lang.Object) = (r6v15 java.lang.Object), (r6v1 java.lang.Object) binds: [B:31:0x00a5, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]
          0x00a7: PHI (r7v9 app.rive.RiveFileSource) = (r7v7 app.rive.RiveFileSource), (r7v16 app.rive.RiveFileSource) binds: [B:31:0x00a5, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]
          0x00a7: PHI (r8v3 app.rive.core.CommandQueue) = (r8v1 app.rive.core.CommandQueue), (r8v7 app.rive.core.CommandQueue) binds: [B:31:0x00a5, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00db, Exception -> 0x00c6, blocks: (B:13:0x0032, B:32:0x00a7, B:18:0x0047, B:26:0x007d, B:30:0x008d, B:21:0x0060, B:24:0x0068, B:27:0x0080, B:28:0x0085, B:29:0x0086), top: B:41:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
        
            if (r6 != r9) goto L26;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object load(final app.rive.RiveFileSource r7, app.rive.core.CommandQueue r8, defpackage.awoq r9) {
            /*
                Method dump skipped, instruction units count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.rive.RiveFile.Companion.load(app.rive.RiveFileSource, app.rive.core.CommandQueue, awoq):java.lang.Object");
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public /* synthetic */ RiveFile(long j, CommandQueue commandQueue, awqx awqxVar) {
        this(j, commandQueue);
    }
}
