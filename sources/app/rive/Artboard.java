package app.rive;

import app.rive.core.ArtboardHandle;
import app.rive.core.CheckableAutoCloseable;
import app.rive.core.CloseOnce;
import app.rive.core.CommandQueue;
import app.rive.core.FileHandle;
import app.rive.core.RiveSurface;
import app.rive.core.SuspendLazy;
import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awqx;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class Artboard implements CheckableAutoCloseable {
    private final long artboardHandle;
    private final CloseOnce closer;
    private final long fileHandle;
    private final String name;
    private final CommandQueue riveWorker;
    private final SuspendLazy stateMachineNamesCache;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = (SuspendLazy.$stable | CloseOnce.$stable) | CommandQueue.$stable;

    private Artboard(long j, CommandQueue commandQueue, long j2, String str) {
        commandQueue.getClass();
        this.artboardHandle = j;
        this.riveWorker = commandQueue;
        this.fileHandle = j2;
        this.name = str;
        this.closer = new CloseOnce(ArtboardHandle.m375toStringimpl(j), new Function0() { // from class: app.rive.Artboard$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Artboard.closer$lambda$0(this.f$0);
            }
        });
        this.stateMachineNamesCache = new SuspendLazy(new Artboard$stateMachineNamesCache$1(this, null));
    }

    static final awmy closer$lambda$0(final Artboard artboard) {
        String str = artboard.name;
        final String strConcat = str != null ? "with name ".concat(str) : "(default)";
        RiveLog.INSTANCE.getLogger().d("Rive/Artboard", new Function0() { // from class: app.rive.Artboard$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Artboard.closer$lambda$0$1(this.f$0, strConcat);
            }
        });
        artboard.riveWorker.m416deleteArtboarduiJWFY8(artboard.artboardHandle);
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closer$lambda$0$1(Artboard artboard, String str) {
        return "Deleting " + ArtboardHandle.m375toStringimpl(artboard.artboardHandle) + ' ' + str + " (" + FileHandle.m533toStringimpl(artboard.fileHandle) + ')';
    }

    public static /* synthetic */ void resizeArtboard$default(Artboard artboard, RiveSurface riveSurface, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        artboard.resizeArtboard(riveSurface, f);
    }

    public final void checkOpen$third_party_java_android_libs_rive_rive_android() {
        this.closer.checkOpen();
    }

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    /* JADX INFO: renamed from: getArtboardHandle-nSTdbJo, reason: not valid java name */
    public final long m269getArtboardHandlenSTdbJo() {
        return this.artboardHandle;
    }

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    /* JADX INFO: renamed from: getFileHandle-ENT3xMk$third_party_java_android_libs_rive_rive_android, reason: not valid java name */
    public final long m270x3cbce2f1() {
        return this.fileHandle;
    }

    public final String getName() {
        return this.name;
    }

    public final CommandQueue getRiveWorker$third_party_java_android_libs_rive_rive_android() {
        return this.riveWorker;
    }

    public final Object getStateMachineNames(awoq awoqVar) {
        this.closer.checkOpen();
        return this.stateMachineNamesCache.await(awoqVar);
    }

    public final Object getVolume(awoq awoqVar) {
        this.closer.checkOpen();
        return this.riveWorker.m431getArtboardVolumeb88yb0A(this.artboardHandle, awoqVar);
    }

    public final void requireFromFile$third_party_java_android_libs_rive_rive_android(RiveFile riveFile) {
        riveFile.getClass();
        m271x52af7cd7(riveFile.getRiveWorker(), riveFile.m289getFileHandleENT3xMk());
    }

    /* JADX INFO: renamed from: requireFromFile-n824lvY$third_party_java_android_libs_rive_rive_android, reason: not valid java name */
    public final void m271x52af7cd7(CommandQueue commandQueue, long j) {
        commandQueue.getClass();
        if (this.riveWorker == commandQueue && FileHandle.m531equalsimpl0(this.fileHandle, j)) {
            return;
        }
        throw new RiveIncompatibleResourceException("Artboard " + ArtboardHandle.m375toStringimpl(this.artboardHandle) + " was not created from RiveFile " + FileHandle.m533toStringimpl(j));
    }

    public final void requireOwnedBy$third_party_java_android_libs_rive_rive_android(CommandQueue commandQueue) {
        commandQueue.getClass();
        if (this.riveWorker == commandQueue) {
            return;
        }
        throw new RiveIncompatibleResourceException("Artboard " + ArtboardHandle.m375toStringimpl(this.artboardHandle) + " is not owned by the required RiveWorker");
    }

    public final void resetArtboardSize() {
        this.closer.checkOpen();
        this.riveWorker.m466resetArtboardSizeuiJWFY8(this.artboardHandle);
    }

    public final void resizeArtboard(RiveSurface riveSurface, float f) {
        riveSurface.getClass();
        this.closer.checkOpen();
        riveSurface.checkOpen$third_party_java_android_libs_rive_rive_android();
        riveSurface.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this.riveWorker);
        this.riveWorker.m467resizeArtboardVFK_cXo(this.artboardHandle, riveSurface, f);
    }

    public final void setVolume(float f) {
        this.closer.checkOpen();
        this.riveWorker.m470setArtboardVolumeb88yb0A(this.artboardHandle, f);
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ Object create$default(Companion companion, RiveFile riveFile, String str, awoq awoqVar, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.create(riveFile, str, awoqVar);
        }

        static final String create$lambda$1(String str, RiveFile riveFile) {
            return "Creating artboard " + str + " (" + FileHandle.m533toStringimpl(riveFile.m289getFileHandleENT3xMk()) + ')';
        }

        static final String create$lambda$3(long j, String str, RiveFile riveFile) {
            return "Created " + ArtboardHandle.m375toStringimpl(j) + ' ' + str + " (" + FileHandle.m533toStringimpl(riveFile.m289getFileHandleENT3xMk()) + ')';
        }

        static final String create$lambda$4(String str, RiveFile riveFile) {
            return "Artboard creation was cancelled " + str + " (" + FileHandle.m533toStringimpl(riveFile.m289getFileHandleENT3xMk()) + ')';
        }

        static final String create$lambda$5(String str, RiveFile riveFile) {
            return "Error creating artboard " + str + " (" + FileHandle.m533toStringimpl(riveFile.m289getFileHandleENT3xMk()) + ')';
        }

        public static /* synthetic */ Artboard fromFile$default(Companion companion, RiveFile riveFile, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.fromFile(riveFile, str);
        }

        static final String fromFile$lambda$2(long j, String str, RiveFile riveFile) {
            return "Created " + ArtboardHandle.m375toStringimpl(j) + ' ' + str + " (" + FileHandle.m533toStringimpl(riveFile.m289getFileHandleENT3xMk()) + ')';
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [app.rive.RiveFile, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10, types: [app.rive.RiveFile] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14, types: [app.rive.RiveFile] */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19, types: [app.rive.RiveFile] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v24 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v22 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v9 */
        public final Object create(RiveFile riveFile, String str, awoq awoqVar) throws Exception {
            Artboard$Companion$create$1 artboard$Companion$create$1;
            final ?? Concat;
            ?? r2;
            ?? r1;
            Object objM404createArtboardByNameConfirmedSTqRd7c;
            ?? r3;
            ?? r4;
            Object objM406createDefaultArtboardConfirmed2ZIOzHc;
            long jM376unboximpl;
            final ?? r5 = riveFile;
            String str2 = str;
            if (awoqVar instanceof Artboard$Companion$create$1) {
                artboard$Companion$create$1 = (Artboard$Companion$create$1) awoqVar;
                int i = artboard$Companion$create$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    artboard$Companion$create$1.label = i - Integer.MIN_VALUE;
                } else {
                    artboard$Companion$create$1 = new Artboard$Companion$create$1(this, awoqVar);
                }
            } else {
                artboard$Companion$create$1 = new Artboard$Companion$create$1(this, awoqVar);
            }
            Object obj = artboard$Companion$create$1.result;
            awox awoxVar = awox.a;
            int i2 = artboard$Companion$create$1.label;
            if (i2 != 0) {
                try {
                    if (i2 == 1) {
                        String str3 = (String) artboard$Companion$create$1.L$2;
                        str2 = (String) artboard$Companion$create$1.L$1;
                        RiveFile riveFile2 = (RiveFile) artboard$Companion$create$1.L$0;
                        atqp.j(obj);
                        r2 = str3;
                        r1 = riveFile2;
                        objM404createArtboardByNameConfirmedSTqRd7c = obj;
                        r1 = r5;
                        r2 = Concat;
                        jM376unboximpl = ((ArtboardHandle) objM404createArtboardByNameConfirmedSTqRd7c).m376unboximpl();
                        r5 = r1;
                        Concat = r2;
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str4 = (String) artboard$Companion$create$1.L$2;
                        str2 = (String) artboard$Companion$create$1.L$1;
                        RiveFile riveFile3 = (RiveFile) artboard$Companion$create$1.L$0;
                        atqp.j(obj);
                        r3 = str4;
                        r4 = riveFile3;
                        objM406createDefaultArtboardConfirmed2ZIOzHc = obj;
                        r4 = r5;
                        r3 = Concat;
                        jM376unboximpl = ((ArtboardHandle) objM406createDefaultArtboardConfirmed2ZIOzHc).m376unboximpl();
                        r5 = r4;
                        Concat = r3;
                    }
                } catch (CancellationException e) {
                    e = e;
                    Concat = r5;
                    r5 = artboard$Companion$create$1;
                    RiveLog.INSTANCE.getLogger().d("Rive/Artboard", new Function0() { // from class: app.rive.Artboard$Companion$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Artboard.Companion.create$lambda$4(Concat, r5);
                        }
                    });
                    throw e;
                } catch (Exception e2) {
                    e = e2;
                    Concat = r5;
                    r5 = artboard$Companion$create$1;
                    RiveLog.INSTANCE.getLogger().e("Rive/Artboard", e, new Function0() { // from class: app.rive.Artboard$Companion$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Artboard.Companion.create$lambda$5(Concat, r5);
                        }
                    });
                    throw e;
                }
            } else {
                atqp.j(obj);
                Concat = str2 != null ? "with name ".concat(str2) : "(default)";
                RiveLog.INSTANCE.getLogger().d("Rive/Artboard", new Function0() { // from class: app.rive.Artboard$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Artboard.Companion.create$lambda$1(Concat, r5);
                    }
                });
                try {
                    r5.checkOpen$third_party_java_android_libs_rive_rive_android();
                    if (str2 != null) {
                        CommandQueue riveWorker = r5.getRiveWorker();
                        long jM289getFileHandleENT3xMk = r5.m289getFileHandleENT3xMk();
                        artboard$Companion$create$1.L$0 = r5;
                        artboard$Companion$create$1.L$1 = str2;
                        artboard$Companion$create$1.L$2 = Concat;
                        artboard$Companion$create$1.label = 1;
                        objM404createArtboardByNameConfirmedSTqRd7c = riveWorker.m404createArtboardByNameConfirmedSTqRd7c(jM289getFileHandleENT3xMk, str2, artboard$Companion$create$1);
                        if (objM404createArtboardByNameConfirmedSTqRd7c == awoxVar) {
                            r1 = r5;
                            r2 = Concat;
                            return awoxVar;
                        }
                        r1 = r5;
                        r2 = Concat;
                        jM376unboximpl = ((ArtboardHandle) objM404createArtboardByNameConfirmedSTqRd7c).m376unboximpl();
                        r5 = r1;
                        Concat = r2;
                    } else {
                        CommandQueue riveWorker2 = r5.getRiveWorker();
                        long jM289getFileHandleENT3xMk2 = r5.m289getFileHandleENT3xMk();
                        artboard$Companion$create$1.L$0 = r5;
                        artboard$Companion$create$1.L$1 = null;
                        artboard$Companion$create$1.L$2 = Concat;
                        artboard$Companion$create$1.label = 2;
                        objM406createDefaultArtboardConfirmed2ZIOzHc = riveWorker2.m406createDefaultArtboardConfirmed2ZIOzHc(jM289getFileHandleENT3xMk2, artboard$Companion$create$1);
                        if (objM406createDefaultArtboardConfirmed2ZIOzHc == awoxVar) {
                            r4 = r5;
                            r3 = Concat;
                            return awoxVar;
                        }
                        r4 = r5;
                        r3 = Concat;
                        jM376unboximpl = ((ArtboardHandle) objM406createDefaultArtboardConfirmed2ZIOzHc).m376unboximpl();
                        r5 = r4;
                        Concat = r3;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    RiveLog.INSTANCE.getLogger().d("Rive/Artboard", new Function0() { // from class: app.rive.Artboard$Companion$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Artboard.Companion.create$lambda$4(Concat, r5);
                        }
                    });
                    throw e;
                } catch (Exception e4) {
                    e = e4;
                    RiveLog.INSTANCE.getLogger().e("Rive/Artboard", e, new Function0() { // from class: app.rive.Artboard$Companion$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Artboard.Companion.create$lambda$5(Concat, r5);
                        }
                    });
                    throw e;
                }
            }
            String str5 = str2;
            final long j = jM376unboximpl;
            RiveLog.INSTANCE.getLogger().d("Rive/Artboard", new Function0() { // from class: app.rive.Artboard$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Artboard.Companion.create$lambda$3(j, Concat, r5);
                }
            });
            return new Artboard(j, r5.getRiveWorker(), r5.m289getFileHandleENT3xMk(), str5, null);
        }

        public final Artboard fromFile(final RiveFile riveFile, String str) {
            long jM405createDefaultArtboard6NrLy0M;
            final String strConcat;
            riveFile.getClass();
            riveFile.checkOpen$third_party_java_android_libs_rive_rive_android();
            if (str != null) {
                jM405createDefaultArtboard6NrLy0M = riveFile.getRiveWorker().m403createArtboardByName2ZIOzHc(riveFile.m289getFileHandleENT3xMk(), str);
                strConcat = "with name ".concat(str);
            } else {
                jM405createDefaultArtboard6NrLy0M = riveFile.getRiveWorker().m405createDefaultArtboard6NrLy0M(riveFile.m289getFileHandleENT3xMk());
                strConcat = "(default)";
            }
            final long j = jM405createDefaultArtboard6NrLy0M;
            RiveLog.INSTANCE.getLogger().d("Rive/Artboard", new Function0() { // from class: app.rive.Artboard$Companion$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Artboard.Companion.fromFile$lambda$2(j, strConcat, riveFile);
                }
            });
            return new Artboard(j, riveFile.getRiveWorker(), riveFile.m289getFileHandleENT3xMk(), str, null);
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public /* synthetic */ Artboard(long j, CommandQueue commandQueue, long j2, String str, awqx awqxVar) {
        this(j, commandQueue, j2, str);
    }
}
