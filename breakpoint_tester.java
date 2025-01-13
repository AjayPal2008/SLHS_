public class breakpoint_tester {



        /**
         * A rectangular array that holds the data representing a
         * rectangular area of the sky
         */
        private double[][] view;

        /**
         * Constructs a SkyView object from a 1-dimensional array of scan data
         *
         * @param numRows Number of rows represented in the view
         *                Precondition: numRows > 0
         * @param numCols Number of columns represented in the view
         *                Precondition: numCols > 0
         * @param scanned The scan data received from the telescope, stored in
         *                telescope order
         *                Precondition: scanned.length = numRows * numCols;
         *
         * PostCondition: View has been created as a rectangular 2-dimensional
         * array with numRows rows and numCols columns and the values in scanned
         * have been copied to view and are order as in the original rectnagular
         * area of sky
         */
        public void SkyView( int numRows, int numCols, double[] scanned ) {
            view = new double[numRows][numCols];
            int count = scanned.length;
            int index = 0 ;

            for(int i = 0 ; i<numRows ; i++){
                if(i%2==0){
                    for(int j = 0 ; j<numCols ; j++){
                        view[i][j] = scanned [index];
                        index++;
                    }
                }
                else{
                    for(int j = numCols-1 ; j>=0 ; j--){
                        view[i][j] = scanned [index];
                        index++;
                    }

                }

            }

        }

        /**
         * Returns the average of the values in a rectangular section of view
         *
         * @param startRow The first row index of the section
         * @param endRow   The last row index of the section
         * @param startCol The first column index of the section
         * @param endCol   The last column index of the section
         *
         * Precondition: 0 <= startRow <= endRow < view.length
         * Precondition: 0 <= startCol <= endCol < view[0].length
         *
         * @return The average of the values in the specified section of view
         */
        public double getAverage( int startRow, int endRow, int startCol, int endCol ) {
            double sum = 0;
            for(int i = startRow ; i<=endRow ; i++ ){
                for(int j = startCol ; j<=endCol ; j++){
                    sum += view[startCol][endCol];
                }
            }

            int div = (endRow-startRow+1)*(endCol-startCol+1);
            return (sum*1.0)/div;
        }

        // There may be instance variables, constructors, and methods that are not shown

    }

