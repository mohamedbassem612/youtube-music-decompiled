package app.rive;

import android.util.Log;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveLog {
    public static final int $stable = 0;
    public static final RiveLog INSTANCE = new RiveLog();
    private static volatile Logger logger = NoOpLogger.INSTANCE;

    /* JADX INFO: compiled from: PG */
    public final class LogcatLogger implements Logger {
        public static final int $stable = 0;

        @Override // app.rive.RiveLog.Logger
        public void d(String str, Function0 function0) {
            str.getClass();
            function0.getClass();
        }

        @Override // app.rive.RiveLog.Logger
        public void e(String str, Throwable th, Function0 function0) {
            str.getClass();
            function0.getClass();
            Log.e(str, (String) function0.invoke(), th);
        }

        @Override // app.rive.RiveLog.Logger
        public void i(String str, Function0 function0) {
            str.getClass();
            function0.getClass();
        }

        @Override // app.rive.RiveLog.Logger
        public void v(String str, Function0 function0) {
            str.getClass();
            function0.getClass();
        }

        @Override // app.rive.RiveLog.Logger
        public void w(String str, Function0 function0) {
            str.getClass();
            function0.getClass();
            Log.w(str, (String) function0.invoke());
        }
    }

    /* JADX INFO: compiled from: PG */
    public interface Logger {

        /* JADX INFO: renamed from: app.rive.RiveLog$Logger$-CC, reason: invalid class name */
        /* JADX INFO: compiled from: PG */
        public final /* synthetic */ class CC {
            public static void $default$d(Logger logger, String str, Function0 function0) {
                str.getClass();
                function0.getClass();
            }

            public static void $default$e(Logger logger, String str, Throwable th, Function0 function0) {
                str.getClass();
                function0.getClass();
            }

            public static void $default$i(Logger logger, String str, Function0 function0) {
                str.getClass();
                function0.getClass();
            }

            public static void $default$v(Logger logger, String str, Function0 function0) {
                str.getClass();
                function0.getClass();
            }

            public static void $default$w(Logger logger, String str, Function0 function0) {
                str.getClass();
                function0.getClass();
            }

            public static /* synthetic */ void e$default(Logger logger, String str, Throwable th, Function0 function0, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
                }
                if ((i & 2) != 0) {
                    th = null;
                }
                logger.e(str, th, function0);
            }
        }

        void d(String str, Function0 function0);

        void e(String str, Throwable th, Function0 function0);

        void i(String str, Function0 function0);

        void v(String str, Function0 function0);

        void w(String str, Function0 function0);
    }

    /* JADX INFO: compiled from: PG */
    public final class NoOpLogger implements Logger {
        public static final int $stable = 0;
        public static final NoOpLogger INSTANCE = new NoOpLogger();

        private NoOpLogger() {
        }

        @Override // app.rive.RiveLog.Logger
        public /* synthetic */ void d(String str, Function0 function0) {
            Logger.CC.$default$d(this, str, function0);
        }

        @Override // app.rive.RiveLog.Logger
        public /* synthetic */ void e(String str, Throwable th, Function0 function0) {
            Logger.CC.$default$e(this, str, th, function0);
        }

        @Override // app.rive.RiveLog.Logger
        public /* synthetic */ void i(String str, Function0 function0) {
            Logger.CC.$default$i(this, str, function0);
        }

        @Override // app.rive.RiveLog.Logger
        public /* synthetic */ void v(String str, Function0 function0) {
            Logger.CC.$default$v(this, str, function0);
        }

        @Override // app.rive.RiveLog.Logger
        public /* synthetic */ void w(String str, Function0 function0) {
            Logger.CC.$default$w(this, str, function0);
        }
    }

    private RiveLog() {
    }

    public static final void d(String str, Function0 function0) {
        str.getClass();
        function0.getClass();
        INSTANCE.getLogger().d(str, function0);
    }

    public static final void e(String str, Throwable th, Function0 function0) {
        str.getClass();
        function0.getClass();
        INSTANCE.getLogger().e(str, th, function0);
    }

    public static /* synthetic */ void e$default(String str, Throwable th, Function0 function0, int i, Object obj) {
        str.getClass();
        function0.getClass();
        Logger logger2 = INSTANCE.getLogger();
        if ((i & 2) != 0) {
            th = null;
        }
        logger2.e(str, th, function0);
    }

    public static final void i(String str, Function0 function0) {
        str.getClass();
        function0.getClass();
        INSTANCE.getLogger().i(str, function0);
    }

    public static final void logD(String str, final String str2) {
        str.getClass();
        str2.getClass();
        logger.d(str, new Function0() { // from class: app.rive.RiveLog$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str3 = str2;
                RiveLog riveLog = RiveLog.INSTANCE;
                return str3;
            }
        });
    }

    public static final void logE(String str, final String str2) {
        str.getClass();
        str2.getClass();
        logger.e(str, null, new Function0() { // from class: app.rive.RiveLog$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str3 = str2;
                RiveLog riveLog = RiveLog.INSTANCE;
                return str3;
            }
        });
    }

    public static final void logI(String str, final String str2) {
        str.getClass();
        str2.getClass();
        logger.i(str, new Function0() { // from class: app.rive.RiveLog$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str3 = str2;
                RiveLog riveLog = RiveLog.INSTANCE;
                return str3;
            }
        });
    }

    public static final void logV(String str, final String str2) {
        str.getClass();
        str2.getClass();
        logger.v(str, new Function0() { // from class: app.rive.RiveLog$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str3 = str2;
                RiveLog riveLog = RiveLog.INSTANCE;
                return str3;
            }
        });
    }

    public static final void logW(String str, final String str2) {
        str.getClass();
        str2.getClass();
        logger.w(str, new Function0() { // from class: app.rive.RiveLog$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str3 = str2;
                RiveLog riveLog = RiveLog.INSTANCE;
                return str3;
            }
        });
    }

    public static final void v(String str, Function0 function0) {
        str.getClass();
        function0.getClass();
        INSTANCE.getLogger().v(str, function0);
    }

    public static final void w(String str, Function0 function0) {
        str.getClass();
        function0.getClass();
        INSTANCE.getLogger().w(str, function0);
    }

    public final Logger getLogger() {
        return logger;
    }

    public final void setLogger(Logger logger2) {
        logger2.getClass();
        logger = logger2;
    }

    static final String logD$lambda$0(String str) {
        return str;
    }

    static final String logE$lambda$0(String str) {
        return str;
    }

    static final String logI$lambda$0(String str) {
        return str;
    }

    static final String logV$lambda$0(String str) {
        return str;
    }

    static final String logW$lambda$0(String str) {
        return str;
    }
}
