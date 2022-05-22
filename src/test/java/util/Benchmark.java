package util;

public class Benchmark {
    private final Runnable action;

    public Benchmark(Runnable action) {
        this.action = action;
    }

    public BenchmarkData run() {
        System.gc();
        long beingTime = System.currentTimeMillis();
        long beingMemory = getMemory();

        action.run();

        return new BenchmarkData(
            beingTime, beingMemory, System.currentTimeMillis(), getMemory()
        );
    }

    private long getMemory() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    public static class BenchmarkData {
        private final long beingTime;
        private final long beingMemory;
        private final long endTime;
        private final long endMemory;

        public BenchmarkData(long beingTime, long beingMemory, long endTime, long endMemory) {
            this.beingTime = beingTime;
            this.beingMemory = beingMemory;
            this.endTime = endTime;
            this.endMemory = endMemory;
        }

        public long getTime() {
            return endTime - beingTime;
        }

        public long getMemory() {
            return endMemory - beingMemory;
        }

        public void print() {
            System.out.printf("소요 시간 %d ms", getTime());
            System.out.println();
            System.out.printf("사용 메모리 %d bytes", getMemory());
            System.out.println();
        }
    }
}
