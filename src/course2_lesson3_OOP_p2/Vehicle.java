package course2_lesson3_OOP_p2;

public class Vehicle implements VehicleService {
        private String modelName;
        private int wheelsCount;
        private String vehicleClassName;

        public String getModelName() {
                return modelName;
        }

        public void setModelName(String modelName) {
                this.modelName = modelName;
        }

        public int getWheelsCount() {
                return wheelsCount;
        }

        public String getVehicleClassName() {
                return vehicleClassName;
        }

        public void setVehicleClassName(String vehicleClassName) {
                this.vehicleClassName = vehicleClassName;
        }

        public void setWheelsCount(int wheelsCount) {
                this.wheelsCount = wheelsCount;
        }

        @Override
        public void fixTyre() {
        }

        @Override
        public void suddenTroubleFix() {
        }

        @Override
        public void fitTuneUpgrade() {
                // replace systems or parts with better ones for more performance
        }

        @Override
        public void regularService() {
        }

}
